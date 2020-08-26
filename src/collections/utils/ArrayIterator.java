package collections.utils;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Integer>{

	private int[] data;
	private int length;
	private int i;
	
	
	public ArrayIterator(int[] data, int length) {
		this.data = data;
		this.length = length;
		this.i = 0;
	}
	
	@Override
	public boolean hasNext() {
		return this.i < this.length;
	}

	@Override
	public Integer next() {
		int v = this.data[i];
		this.i += 1;
		return v;
	}

}
