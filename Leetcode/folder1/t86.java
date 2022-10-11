public class t86 {
	public ListNode partition(ListNode head, int x) {
		ListNode bigHead = new ListNode(), big = bigHead;
		ListNode p = head;
		ListNode smallHead = new ListNode(), small = smallHead;
		while (p != null) {
			if (p.val < x) {
				small.next = p;
				small = small.next;
			} else {
				big.next = p;
				big = big.next;
			}
			p = p.next;
		}
		big.next = null;
		small.next = bigHead.next;
		return smallHead.next;
	}
}
