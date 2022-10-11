import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 作者： chris
 * 时间:  2022-08-26
 */
public class t19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode tmp = new ListNode();
        tmp.next = head;

        ListNode slow = tmp, fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return tmp.next;

    }
}
