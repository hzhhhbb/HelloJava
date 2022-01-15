package Array;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers runner = new AddTwoNumbers();
        ListNode actualValue = runner.addTwoNumbers(l1, l2);
        assert actualValue.val == 7 && actualValue.next.val == 0 && actualValue.next.next.val == 8;
    }

}