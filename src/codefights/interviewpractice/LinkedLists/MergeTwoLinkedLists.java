package codefights.interviewpractice.LinkedLists;

public class MergeTwoLinkedLists {
    class ListNode<T> {
        ListNode(T x) {
            value = x;
        }

        T value;
        ListNode<T> next;
    }

    ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> last = null;
        ListNode<Integer> head = null;
        ListNode<Integer> x1 = l1;
        ListNode<Integer> x2 = l2;
        while (x1 != null || x2 != null) {
            ListNode<Integer> old = last;
            int value = -1;
            if (x1 == null) {
                value = x2.value;
                x2 = x2.next;
            } else if (x2 == null) {
                value = x1.value;
                x1 = x1.next;
            } else if (x1.value < x2.value) {
                value = x1.value;
                x1 = x1.next;
            } else {
                value = x2.value;
                x2 = x2.next;
            }

            last = new ListNode<Integer>(value);
            if (old != null) old.next = last;
            if (head == null) head = last;
        }
        return head;
    }
}
