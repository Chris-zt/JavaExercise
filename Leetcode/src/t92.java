public class t92 {
	ListNode rightNode = null;
	public ListNode reverseBetween(ListNode head, int left, int right) {
		if (left == 1) {
			if (right == 1) {
				rightNode = head.next;
				return head;
			}
			ListNode last = reverseBetween(head.next, 1, right - 1);
			head.next.next = head;
			head.next = rightNode;
			return last;
		}
		if (left == 2) {
			head.next = reverseBetween(head.next, left - 1, right - 1);
		}
		return head;
	}
}
