/**
 * 作者： chris
 * 时间:  2022-07-21
 */



public class t206
{
    public ListNode reverseList(ListNode head)
    {
        ListNode pre = null, cur = head;
        while(cur != null)
        {
            ListNode t = cur;
            cur = cur.next;
            t.next = pre;
            pre = t;
        }
        return pre;
    }
}
