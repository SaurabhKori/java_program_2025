package linkedlist;

public class SinglyLinkedList {
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "--->");
			current = current.next;
		}
		System.out.println("null");
	}

	public long length() {
		ListNode current = head;
		long count = 0;
		while (current != null) {
			++count;
			current = current.next;
		}
//		System.out.println("Length-->" + count);
		return count;
	}

	public void insertFirst(int data) {
		ListNode node = new ListNode(data);
		node.next = head;
		head = node;
	}

	public void insertLast(int data) {
		ListNode node = new ListNode(data);
		if (head == null) {
			head = node;
			return;
		}
		ListNode current = head;
		while (null != current.next) {
			current = current.next;
		}
		current.next = node;
	}

	public void insert(int position, int data) {
		ListNode node = new ListNode(data);
		if (position == 1) {
			node.next = head;
			head = node;
		} else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = node;

		}
	}
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
//		sll.head = new ListNode(10);
//		ListNode second = new ListNode(1);
//		ListNode third = new ListNode(8);
//		ListNode fourth = new ListNode(11);
//		sll.head.next = second;
//		second.next = third;
//		third.next = fourth;
//		sll.insertLast(10);
//		sll.insertLast(6);
//		sll.insertLast(2);
//		sll.insertLast(7);
//		sll.insertLast(12);
		sll.insert(1, 10);
		sll.insert(2, 6);
		sll.insert(3, 2);
		sll.insert(1, 7);
		sll.insert(5, 12);
		sll.display();

		System.err.println(sll.length());
	}
}
