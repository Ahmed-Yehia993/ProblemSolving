package codefights.interviewpractice.LinkedLists;

public class IsListPalindrome {
    class ListNode<T> {
        ListNode(T x) {
            value = x;
        }

        T value;
        ListNode<T> next;
    }
    boolean isListPalindrome(ListNode<Integer> l) {
        ListNode<Integer> x = l;

        ListNode<Integer> head = null;
        int index = 0;
        while(x != null) {

            ListNode<Integer> old = head;
            head = new ListNode<Integer>(x.value);
            head.next = old;

            x = x.next;
            index++;
        }

        ListNode<Integer> x2 = head;
        int index2 = 0;
        x = l;
        while(x != null) {
            if(index2 > index / 2) break;
            if(x.value.intValue() != x2.value.intValue()) {
                return false;
            }
            x = x.next;
            x2 = x2.next;
            index2++;
        }
        return true;
    }
}
