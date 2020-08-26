package collections.stacks;

import collections.utils.Node;

public class LinkedStack implements Stack{
	
	Node top;
	
	@Override
	public void push(int v) {
		Node n = new Node();
		n.value = v;
		n.next = top;
		top = n;
	}

	@Override
	public int pop() {
		int v = top.value;
		top = top.next;
		return v;
	}

	@Override
	public int peek() {
		return top.value;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

}
