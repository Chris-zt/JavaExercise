/**
 * 作者： chris
 * 时间:  2022-08-26
 */
public class t23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode[] nodes = new ListNode[lists.length];

        for (int i = 0; i < lists.length; i++) {
            nodes[i] = lists[i];
        }

        ListNode res = new ListNode();
        ListNode tmp = res;

        boolean flag = true;
        while (flag) {
            flag = false;
            int minValue = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int i = 0; i < lists.length; i++) {
                if (!flag && nodes[i] != null) {
                    flag = true;
                    minIndex = i;
                    minValue = nodes[i].val;
                } else if (nodes[i] != null) {
                    if (nodes[i].val < minValue) {
                        minValue = nodes[i].val;
                        minIndex = i;
                    }
                }
            }
            if (!flag) {
                return res.next;
            }
            tmp.next = new ListNode(minValue, null);
            tmp = tmp.next;
            nodes[minIndex] = nodes[minIndex].next;
        }
        return res.next;
    }
}
