package io.sampadadubey.java.codingbat.warmup2;

import static io.sampadadubey.java.common.NumberConstants.THREE;

public final class NoTriples {

    public boolean noTriples(final int[] nums) {

        boolean result = true;

        if (nums != null && nums.length >= THREE) {

            int lastNum = nums[0];
            int numCount = 0;

            for (final int number : nums) {

                if (number == lastNum) {
                    numCount++;
                } else {
                    lastNum = number;
                    numCount = 1;
                    continue;
                }

                if (numCount == THREE) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}
