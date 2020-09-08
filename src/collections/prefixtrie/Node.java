package collections.prefixtrie;

import java.util.Map;

class Node {
	String value;
	Map<String, Node> next;
	
	@Override
	public String toString() {
		if(next == null) {
			return value;
		}
		return value + "->" + next;
	}
}
