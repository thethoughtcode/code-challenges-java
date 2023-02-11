package io.thoughtcode.java.exercism.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;

import static java.lang.Class.forName;

@SuppressWarnings("unchecked")
public abstract class ReflectionProxy {

    /**
     * An instance of the target class (if found)
     */
    private final Object target;

    /**
     * A constructor to instantiate the target class with parameters
     * @param args An array of parameters matching the constructor from the target class
     */
    protected ReflectionProxy(final Object... args) {
        this.target = instantiateTarget(args);
    }

    /**
     * Abstract method that defines the fully qualified name of the target class
     * @return The fully qualified name of the target class
     */
    public abstract String getTargetClassName();

    /**
     * Getter for the target instance
     * @return The target instance
     */
    public Object getTarget() {
        return target;
    }

    /**
     * Gets the target class
     * @return The target class if it exists, null otherwise
     */
    public Class<?> getTargetClass() {

        Class<?> result = null;

        try {
            result = forName(this.getTargetClassName());
        } catch (final ClassNotFoundException e) {
            result = null;
        }

        return result;
    }

    /**
     * Checks if the target class has a specific method
     * @param name The name of the method to find
     * @param parameterTypes The list of parameter types
     * @return True if the method is found, false otherwise
     */
    public boolean hasMethod(final String name, final Class<?>... parameterTypes) {
        final Class<?> targetClass = getTargetClass();
        boolean hasMethod = false;
        if (targetClass == null || name == null) {
            hasMethod = false;
        } else {
            try {
                final Method method = targetClass.getDeclaredMethod(name, parameterTypes);
                hasMethod = method != null;
            } catch (final NoSuchMethodException e) {
                hasMethod = false;
            }
        }
        return hasMethod;
    }

    /**
     * Checks if a method from the target class is public
     * @param name The name of the method
     * @param parameterTypes A list of method parameters
     * @return True if the method exists and is public, false otherwise
     */
    public boolean isMethodPublic(final String name, final Class<?>... parameterTypes) {
        final Class<?> targetClass = getTargetClass();
        boolean isMethodPublic = false;
        if (targetClass == null || name == null) {
            isMethodPublic = false;
        } else {
            try {
                final Method method = targetClass.getDeclaredMethod(name, parameterTypes);
                isMethodPublic = Modifier.isPublic(method.getModifiers());
            } catch (final NoSuchMethodException e) {
                isMethodPublic = false;
            }
        }
        return isMethodPublic;
    }

    /**
     * Checks if a method from the target class returns the correct type
     * @param returnType The type of return value
     * @param name The name of the method
     * @param parameterTypes The list of method parameters
     * @return
     */
    public boolean isMethodReturnType(final Class<?> returnType, final String name, final Class<?>... parameterTypes) {
        return isMethodReturnType(returnType, null, name, parameterTypes);
    }

    /**
     * Invokes a method from the target instance
     * @param methodName The name of the method
     * @param parameterTypes The list of parameter types
     * @param parameterValues The list with values for the method parameters
     * @param <T> The result type we expect the method to be
     * @return The value returned by the method
     */
    protected  <T> T invokeMethod(final String methodName, final Class<?>[] parameterTypes, final Object... parameterValues) {
        if (target == null) {
            return null;
        }
        try {
            // getDeclaredMethod is used to get protected/private methods
            final Method method = target.getClass().getDeclaredMethod(methodName, parameterTypes);
            method.setAccessible(true);
            return (T) method.invoke(target, parameterValues);
        } catch (final NoSuchMethodException e) {
            try {
                // try getting it from parent class, but only public methods will work
                final Method method = target.getClass().getMethod(methodName, parameterTypes);
                method.setAccessible(true);
                return (T) method.invoke(target, parameterValues);
            } catch (final Exception ex) {
                return null;
            }
        } catch (final Exception e) {
            return null;
        }
    }

    /**
     * Creates an instance of the target class
     * @param args The list of constructor parameters
     * @return An instance of the target class, if found, or null otherwise
     */
    private Object instantiateTarget(final Object... args) {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null) {
            return null;
        }
        final Constructor<?>[] constructors = getAllConstructors();
        for (final Constructor<?> constructor : constructors) {
            if (constructor.getParameterCount() == args.length) {
                try {
                    return constructor.newInstance(args);
                } catch (final Exception e) {
                    // do nothing;
                }
            }
        }
        return null;
    }

    /**
     * Gets a list with all the constructors defined by the target class
     * @return A list with all constructor definitions
     */
    private Constructor<?>[] getAllConstructors() {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null) {
            return new Constructor<?>[]{};
        }
        return targetClass.getConstructors();
    }


    //region Unused

    /**
     * The default constructor, for when you have already an instance of the target class
     * @param target An instance of the target class
     */
    protected ReflectionProxy(final Object target) {
        this.target = target;
    }

    /**
     * Checks if the target class exists
     * @return True if the class exists, false otherwise
     */
    public boolean existsClass() {
        return getTargetClass() != null;
    }

    /**
     * Checks if the class implements a specific interface
     * @param anInterface The interface to check
     * @return True if the class implements the referred interface, false otherwise
     */
    public boolean implementsInterface(final Class<?> anInterface) {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null || anInterface == null) {
            return false;
        }
        return anInterface.isAssignableFrom(targetClass);
    }

    /**
     * Checks if the target class has a specific property
     * @param name The name of the property to find
     * @return True if the property is found, false otherwise
     */
    public boolean hasProperty(final String name) {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null || name == null) {
            return false;
        }
        try {
            Field field = targetClass.getDeclaredField(name);
            return field != null;
        } catch (final NoSuchFieldException e) {
            return false;
        }
    }

    /**
     * Checks if an existing property has the type we expect
     * @param name The name of the property to check
     * @param type The type you are expecting the property to be
     * @return True if the property is found and has the specified type, false otherwise
     */
    public boolean isPropertyOfType(final String name, final Class<?> type) {
        return isPropertyOfType(name, type, null);
    }

    /**
     * Checks if an existing Collection type has the parameterized type (Generics) as expected (eg. List<String>)
     * @param name The name of the property
     * @param type The type of the property (eg. List)
     * @param parameterizedType The parameterized property (eg. String)
     * @return True if the parameterized type matches the desired type, false otherwise
     */
    public boolean isPropertyOfType(final String name, final Class<?> type, final Class<?> parameterizedType) {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null || name == null || type == null) {
            return false;
        }
        try {
            final Field field = targetClass.getDeclaredField(name);
            if (!field.getType().equals(type)) {
                return false;
            }
            if (parameterizedType == null) {
                return true;
            }
            if (!(field.getGenericType() instanceof ParameterizedType)) {
                return false;
            }
            final ParameterizedType pType = (ParameterizedType) field.getGenericType();
            return pType.getActualTypeArguments()[0].equals(parameterizedType);

        } catch (final NoSuchFieldException e) {
            return false;
        }
    }

    /**
     * Checks if a property is private
     * @param name The name of the property
     * @return True if the property exists and is private, false otherwise
     */
    public boolean isPropertyPrivate(String name) {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null || name == null) {
            return false;
        }
        try {
            final Field field = targetClass.getDeclaredField(name);
            return Modifier.isPrivate(field.getModifiers());
        } catch (final NoSuchFieldException e) {
            return false;
        }
    }

    /**
     * Checks if a method from the target class returns a correct parameterized collection (Generics)
     * @param returnType The return type we expect (eg. List)
     * @param parameterizedType The parameterized type we expect (eg. String)
     * @param name The name of the method
     * @param parameterTypes A list of method parameter types
     * @return True if the method returns the correct parameterized collection, false otherwise
     */
    public boolean isMethodReturnType(final Class<?> returnType, final Class<?> parameterizedType,
                                      final String name, final Class<?>... parameterTypes) {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null || name == null) {
            return false;
        }
        try {
            final Method method = targetClass.getDeclaredMethod(name, parameterTypes);
            if (!method.getReturnType().equals(returnType)) {
                return false;
            }
            if (parameterizedType == null) {
                return true;
            }
            if (!(method.getGenericReturnType() instanceof ParameterizedType)) {
                return false;
            }
            final ParameterizedType pType = (ParameterizedType) method.getGenericReturnType();
            return pType.getActualTypeArguments()[0].equals(parameterizedType);
        } catch (final NoSuchMethodException e) {
            return false;
        }
    }

    /**
     * Checks if a target class has a specific constructor
     * @param parameterTypes The list of desired parameter types
     * @return True if the constructor exists, false otherwise
     */
    public boolean hasConstructor(final Class<?>... parameterTypes) {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null) {
            return false;
        }
        try {
            final Constructor<?> constructor = targetClass.getDeclaredConstructor(parameterTypes);
            return constructor != null;
        } catch (final NoSuchMethodException e) {
            return false;
        }
    }

    /**
     * Checks if a specific constructor from the target class is public
     * @param parameterTypes A list of parameter types
     * @return True if the constructor is found and is public, false otherwise
     */
    public boolean isConstructorPublic(final Class<?>... parameterTypes) {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null) {
            return false;
        }
        try {
            final Constructor<?> constructor = targetClass.getDeclaredConstructor(parameterTypes);
            return Modifier.isPublic(constructor.getModifiers());
        } catch (final NoSuchMethodException e) {
            return false;
        }
    }

    /**
     * Proxy for the 'equals' method
     * @param obj The ReflexionProxy object you want to compare against
     * @return True if both targets are equal, false otherwise
     */
    public boolean equals(Object obj) {
        if (target == null || !(obj instanceof ReflectionProxy)) {
            return false;
        }
        try {
            final Method method = target.getClass().getMethod("equals", Object.class);
            method.setAccessible(true);
            return (boolean) method.invoke(target, ((ReflectionProxy) obj).getTarget());
        } catch (final Exception e) {
            return false;
        }
    }

    /**
     * Proxy for the 'hashCode' method
     * @return The hashCode from the target class
     */
    public int hashCode() {
        if (target == null) {
            return 0;
        }
        try {
            final Method method = target.getClass().getMethod("hashCode");
            method.setAccessible(true);
            return (int) method.invoke(target);
        } catch (final Exception e) {
            return 0;
        }
    }

    /**
     * Proxy for the 'toString' method from the target class
     * @return The result of 'toString' from the target instance
     */
    public String toString() {
        return invokeMethod("toString", new Class[]{ });
    }

    /**
     * Gets a property value from the target instance (if it exists)
     * @param propertyName The name of the property
     * @param <T> The type we are expecting it to be
     * @return The value of the property (if it exists)
     */
    protected <T> T getPropertyValue(final String propertyName) {
        if (target == null || !hasProperty(propertyName)) {
            return null;
        }
        try {
            final Field field = target.getClass().getDeclaredField(propertyName);
            field.setAccessible(true);
            return (T) field.get(target);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Checks if the target class is abstract
     * @return True if the target class exists and is abstract, false otherwise
     */
    public boolean isAbstract() {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null) {
            return false;
        }
        return Modifier.isAbstract(targetClass.getModifiers());
    }

    /**
     * Checks if the target class extends another
     * @param className The fully qualified name of the class it should extend
     * @return True if the target class extends the specified one, false otherwise
     */
    public boolean extendsClass(final String className) {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null) {
            return false;
        }
        try {
            final Class<?> parentClass = Class.forName(className);
            return parentClass.isAssignableFrom(targetClass);
        } catch (final ClassNotFoundException e) {
            return false;
        }
    }

    /**
     * Checks if the target class is an interface
     * @return True if the target class exists and is an interface, false otherwise
     */
    public boolean isInterface() {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null) {
            return false;
        }
        return targetClass.isInterface();
    }

    /**
     * Checks if a method is abstract
     * @param name The name of the method
     * @param parameterTypes The list of method parameter types
     * @return True if the method exists and is abstract, false otherwise
     */
    public boolean isMethodAbstract(final String name, final Class<?>... parameterTypes) {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null || name == null) {
            return false;
        }
        try {
            final Method method = targetClass.getDeclaredMethod(name, parameterTypes);
            return Modifier.isAbstract(method.getModifiers());
        } catch (final NoSuchMethodException e) {
            return false;
        }
    }

    /**
     * Checks if a method is protected
     * @param name The name of the method
     * @param parameterTypes The list of method parameter types
     * @return True if the method exists and is protected, false otherwise
     */
    public boolean isMethodProtected(final String name, final Class<?>... parameterTypes) {
        final Class<?> targetClass = getTargetClass();
        if (targetClass == null || name == null) {
            return false;
        }
        try {
            final Method method = targetClass.getDeclaredMethod(name, parameterTypes);
            return Modifier.isProtected(method.getModifiers());
        } catch (final NoSuchMethodException e) {
            return false;
        }
    }

    //endregion
}
