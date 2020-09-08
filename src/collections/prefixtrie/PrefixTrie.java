package collections.prefixtrie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class PrefixTrie {

	private Node root;

	public PrefixTrie() {
		root = new Node();
		root.value = "";
	}

	public void insert(String s) {
		s = s + "$";
		char[] letters = s.toCharArray();
		Node start = root;
		for (char c : letters) {
			if (start.next == null) {
				start.next = new HashMap<String, Node>();
			}
			Node next = start.next.get(c + "");
			if (next == null) {
				next = new Node();
				next.value = c + "";
				start.next.put(c + "", next);
			}
			start = next;

		}
	}

	public List<String> query(String prefix) {
		Node current = root;
		char[] letters = prefix.toCharArray();
		for (char c : letters) {
			current = current.next.get(c + "");
		}
		List<String> results = new ArrayList<String>();
		listChildren2(results, prefix, current);
		return results;
	}

	private void listChildren(List<String> results, String prefix, Node current) {
		if(current.value.equals("$")) {
			results.add(prefix);
		}
		if(current.next != null) {
			for(Node n : current.next.values()) {
				if(n.value.equals("$")) {
					listChildren(results, prefix, n);
				}else {
					listChildren(results, prefix + n.value, n);
				}
			}
		}
	}
	
	private void listChildren2(List<String> results, String prefix, Node current) {
		Stack<ListArguments> workToBeDone = new Stack<ListArguments>();
		workToBeDone.add(new ListArguments(prefix, current));
		
		while(!workToBeDone.isEmpty()) {
			ListArguments la = workToBeDone.pop();
			Node c = la.n;
			String pref = la.prefix;
			if(c.value.equals("$")) {
				results.add(pref);
			}
			if(c.next != null) {
				for(Node n : c.next.values()) {
					if(n.value.equals("$")) {
						workToBeDone.add(new ListArguments(pref , n));
					}else {
						workToBeDone.add(new ListArguments(pref + n.value , n));
						
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		return root.toString();
	}
}
