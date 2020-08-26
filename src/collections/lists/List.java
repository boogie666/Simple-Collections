package collections.lists;

public interface List extends Iterable<Integer> {
	void add(int value);
	int remove(int index);
	int get(int index);
	int length();
}
