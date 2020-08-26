package collections.lists;

import java.util.Iterator;

import collections.utils.Node;
import collections.utils.NodeIterator;

public class LinkedList implements List {

	private Node head;

	@Override
	public void add(int value) {
		if (head == null) {
			head = new Node();
			head.value = value;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = new Node();
			n.next.value = value;
		}
	}

	@Override
	public int remove(int index) {
		if (index == 0) {
			int v = head.value;
			head = head.next;
			return v;
		} else {

			int i = 0;

			Node n = head;
			Node p = null;
			while (i < index) {
				i++;
				p = n;
				n = n.next;

			}
			int v = n.value;
			p.next = n.next;
			return v;
		}

	}

	@Override
	public int get(int index) {
		int i = 0;
		Node n = head;
		while (i < index) {
			n = n.next;
			i++;
		}
		return n.value;
	}

	@Override
	public int length() {
		int i = 0;
		Node n = head;
		while (n != null) {
			n = n.next;
			i++;
		}
		return i;
	}

	@Override
	public String toString() {
		String s = "[ ";
		Node n = head;
		while (n != null) {
			s += n.value + " ";
			n = n.next;
		}
		s += "]";
		return s;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new NodeIterator(head);
	}

}
