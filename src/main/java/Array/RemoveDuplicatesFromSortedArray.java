package Array;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int currentIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[currentIndex] != nums[i] && currentIndex < i) {
                currentIndex++;
                nums[currentIndex] = nums[i];
            }
        }
        return currentIndex + 1;
    }
}
