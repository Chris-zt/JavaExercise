/**
 * 作者： chris
 * 时间:  2022-08-24
 */
public class t2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = 0, b = 0;
        ListNode res = new ListNode();
        ListNode cur = res;
        while (l1 != null || l2 != null || a != 0) {
            int tmp = 0;
            if(l1 != null){
                tmp += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                tmp += l2.val;
                l2 = l2.next;
            }
            tmp += a;
            a = tmp / 10;
            b = tmp % 10;
            cur.next = new ListNode(b, null);
            cur = cur.next;
        }

        return res.next;
    }
}


