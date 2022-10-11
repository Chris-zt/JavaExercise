/**
 * 作者： chris
 * 时间:  2022-07-21
 */

/*
class ListNode
{
    int val;
    ListNode next;

    ListNode()
    {
    }

    ListNode(int val)
    {
        this.val = val;
    }

    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}
*/

public class t203
{
    public ListNode removeElements(ListNode head, int val)
    {
        ListNode res = new ListNode();
        ListNode p = res;

        ListNode present = head;
        while(present != null)
        {
            if(present.val != val)
            {
                p.next = present;
                p = present;
            }
            present = present.next;
        }
        p.next = null;
        return res.next;
    }
}
