package Array;

import java.util.Arrays;

public class FindMiddleIndex {
    public int findMiddleIndex(int[] nums) {
        if (nums.length <= 0) return 0;

        long leftSum = 0;
        long rightSum = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++) {
            if (leftSum - nums[i] == rightSum) {
                return i;
            }
            if (leftSum == rightSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
            rightSum -= nums[i];
        }

        return -1;
    }
}
