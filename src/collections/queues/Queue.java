package collections.queues;

public interface Queue {
	void enqueue(int v);
	int dequeue();
	int peek();
	boolean isEmpty();
}
