package collections.lists;

import java.util.Iterator;

import collections.utils.ArrayIterator;

public class ArrayList implements List{
	
	private int data[];
	private int size;
	public ArrayList() {
		this.data = new int[16];
		this.size = 0;
	}
	
	@Override
	public void add(int value) {
		//check if array is large enough
		//if not double the array
		data[size] = value;
		size =  size + 1;
	}

	@Override
	public int remove(int index) {
		if(index >= size) {
			throw new IndexOutOfBoundsException("Index is invalid: " + index);
		}
		int v = data[index];
		size--;
		for(int i = index; i < size; i++) {
			data[i] = data[i + 1];
		}
		
		//check if we can shrink the array
		//if we can, then half the array
		return v;
	}

	@Override
	public int get(int index) {
		//check for if index is valid
		//if not then throw new IndexOutOfBounds exception  (same as in remove)
		return data[index];
	}

	@Override
	public String toString() {
		String s = "[ ";
		for(int i = 0; i < size; i++) {
			s += data[i] + " ";
		}
		s += "] " + data.length;
		return s;
	}
	
	@Override
	public int length() {
		return size;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new ArrayIterator(data, size);
	}

}
