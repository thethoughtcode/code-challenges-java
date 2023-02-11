package io.thoughtcode.java.codingbat.warmup2;

import static io.thoughtcode.java.common.NumberConstants.FIVE;
import static io.thoughtcode.java.common.NumberConstants.TWO;

import java.util.Optional;

public final class Has271 {

    public boolean has271(final int[] input) {

        boolean result = false;

        final int[] nums = Optional.ofNullable(input).orElse(new int[]{});

        for (int index = 0; index < nums.length - TWO; index++) {

            final int val = nums[index];

            if (nums[index + 1] == (val + FIVE) // the "7" check
                    && Math.abs(nums[index + TWO] - val + 1) <= TWO) { // the "1" check
                result = true;
                break;
            }
        }

        return result;
    }
}
