package collections.stacks;

public class ArrayStack implements Stack {

	private int[] data;
	private int topIndex;

	public ArrayStack() {
		data = new int[8];
		this.topIndex = -1;
	}

	@Override
	public void push(int v) {
		topIndex = topIndex + 1;
		if (data.length == topIndex) {
			int newSize = data.length * 2;
			int[] newData = new int[newSize];
			for (int i = 0; i < data.length; i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
		data[topIndex] = v;
	}

	@Override
	public int pop() {
		int value = this.data[topIndex];
		this.data[topIndex] = 0;
		topIndex--;

		if (topIndex < data.length / 3) {
			int[] newData = new int[data.length / 2];
			for (int i = 0; i < topIndex + 1; i++) {
				newData[i] = data[i];
			}
			data = newData;
		}

		return value;
	}

	@Override
	public int peek() {
		return this.data[topIndex];
	}

	@Override
	public boolean isEmpty() {
		return topIndex == -1;
	}

}
