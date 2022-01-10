package Array;

import org.junit.jupiter.api.Test;

class FindMiddleIndexTest {

    @Test
    void findMiddleIndex() {
        FindMiddleIndex runner = new FindMiddleIndex();
        int[] nums = new int[]{2, 3, -1, 8, 4};
        int expectValue = 3;
        int actualValue = runner.findMiddleIndex(nums);
        System.out.println(actualValue);
        assert expectValue == actualValue;
    }

    @Test
    void findMiddleIndex1() {
        FindMiddleIndex runner = new FindMiddleIndex();
        int[] nums = new int[]{1, -1, 4};
        int expectValue = 2;
        int actualValue = runner.findMiddleIndex(nums);
        System.out.println(actualValue);
        assert expectValue == actualValue;
    }

    @Test
    void findMiddleIndex2() {
        FindMiddleIndex runner = new FindMiddleIndex();
        int[] nums = new int[]{2, 5};
        int expectValue = -1;
        int actualValue = runner.findMiddleIndex(nums);
        System.out.println(actualValue);
        assert expectValue == actualValue;
    }

    @Test
    void findMiddleIndex3() {
        FindMiddleIndex runner = new FindMiddleIndex();
        int[] nums = new int[]{1};
        int expectValue = 0;
        int actualValue = runner.findMiddleIndex(nums);
        System.out.println(actualValue);
        assert expectValue == actualValue;
    }

    @Test
    void findMiddleIndex4() {
        FindMiddleIndex runner = new FindMiddleIndex();
        int[] nums = new int[]{-1,2};
        int expectValue = -1;
        int actualValue = runner.findMiddleIndex(nums);
        System.out.println(actualValue);
        assert expectValue == actualValue;
    }
}