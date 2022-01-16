package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//15. 三数之和
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length <= 2) {
            return new ArrayList<List<Integer>>(0);
        }
        // 升序
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int currentNum = nums[0];
        for (int c = 0; c < nums.length - 2; c++) {
            if (nums[c] > 0) {
                break;
            }
            if (c > 0 && nums[c] == nums[c - 1]) {
                continue;
            }

            int left = c + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[c] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[c], nums[left], nums[right])));
                    while (left < right && nums[left] == nums[++left]) ;
                    while (left < right && nums[right] == nums[--right]) ;
                } else if (sum < 0) {
                    while (left < right && nums[left] == nums[++left]) ;
                } else if (sum > 0) {
                    while (left < right && nums[right] == nums[--right]) ;
                }
            }

        }

        return result;
    }
}
