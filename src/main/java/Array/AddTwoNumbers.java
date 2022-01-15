package Array;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode first = l1;
        ListNode second = l2;
        ListNode currentResultNode = result;
        int lastNum = 0;
        while (first != null || second != null) {
            if (first != null) {
                lastNum += first.val;
                first = first.next;
            }
            if (second != null) {
                lastNum += second.val;
                second = second.next;
            }
            currentResultNode.val = lastNum % 10;
            lastNum = lastNum - currentResultNode.val;
            lastNum = lastNum / 10;
            if (first != null || second != null) {
                currentResultNode.next = new ListNode();
                currentResultNode = currentResultNode.next;
            }

        }
        if (lastNum > 0) {
            currentResultNode.next = new ListNode(lastNum);
        }

        return result;
    }
}


