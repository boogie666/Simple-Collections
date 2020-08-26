package collections.queues;

public class ArrayQueue implements Queue{
	private int[] data;
	private int lastIndex;
	
	public ArrayQueue() {
		data = new int[8];
		lastIndex = -1;
	}
	@Override
	public void enqueue(int v) {
		lastIndex = lastIndex + 1;
		if (data.length == lastIndex) {
			int newSize = data.length * 2;
			int[] newData = new int[newSize];
			for (int i = 0; i < data.length; i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
		data[lastIndex] = v;
	}

	@Override
	public int dequeue() {
		int v = data[0];
		for(int i = 0; i < lastIndex - 1; i++) {
			data[i] = data[i + 1];
		}
		data[lastIndex] = 0;
		
		if (lastIndex < data.length / 3) {
			int[] newData = new int[data.length / 2];
			for (int i = 0; i < lastIndex + 1; i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
		
		return v;
	}

	@Override
	public int peek() {
		return data[0];
	}

	@Override
	public boolean isEmpty() {
		return lastIndex == -1;
	}

}
