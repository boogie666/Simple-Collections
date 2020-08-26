package collections.queues;

import collections.utils.Node;

public class LinkedQueue implements Queue {

	public Node head;

	@Override
	public void enqueue(int v) {
		if (head == null) {
			head = new Node();
			head.value = v;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = new Node();
			n.next.value = v;
		}
	}

	@Override
	public int dequeue() {
		int v = head.value;
		head = head.next;
		return v;
	}

	@Override
	public int peek() {
		return head.value;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}


}
