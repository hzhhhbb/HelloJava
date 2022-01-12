package Array;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicates() {
        int[] nums = new int[]{1, 1, 2};
        RemoveDuplicatesFromSortedArray runner = new RemoveDuplicatesFromSortedArray();
        int expectResult = 2;
        int actualResult = runner.removeDuplicates(nums);
        assert expectResult == actualResult;
        assert nums[1] == 2;
    }

    @Test
    void removeDuplicates1() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray runner = new RemoveDuplicatesFromSortedArray();
        int expectResult = 5;
        int actualResult = runner.removeDuplicates(nums);
        assert expectResult == actualResult;
        assert nums[1] == 1;
    }

    @Test
    void removeDuplicates2() {
        int[] nums = new int[]{};
        RemoveDuplicatesFromSortedArray runner = new RemoveDuplicatesFromSortedArray();
        int expectResult = 0;
        int actualResult = runner.removeDuplicates(nums);
        assert expectResult == actualResult;

    }
}