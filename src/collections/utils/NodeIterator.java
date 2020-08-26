package collections.utils;

import java.util.Iterator;

public class NodeIterator implements Iterator<Integer> {

	private Node current;
	
	
	public NodeIterator(Node current) {
		this.current = current;
	}
	
	@Override
	public boolean hasNext() {
		return this.current != null;
	}

	@Override
	public Integer next() {
		int v = current.value;
		current = current.next;
		return v;
	}

}
