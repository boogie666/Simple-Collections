package collections;

import collections.lists.LinkedList;
import collections.lists.List;

public class Main {
	public static void main(String[] args) {
		List l = new LinkedList();
		
		for(int i = 0; i < 10; i++) {
			l.add(i);
		}

		
		for(int e : l) {
			System.out.println(e);
		}
	}

}
