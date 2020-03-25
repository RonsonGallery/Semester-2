public class Stack {
	private int[] data;
	private int top1;
	private int capacity;
	
	public Stack(int size)
	{
		top1 = -1;
		data = new int[10];
		capacity = size;
	}
	// Adds new integer to the stack
	public void Push(int x) {
		if((top1 + 1)>=capacity) {
			int temp[] = new int[capacity+5];
			for(int i = 0;i<capacity;i++) {
				temp[i] = data[i];
			}
			data = null;
			data = new int[capacity+5];
			capacity += 5;
			for(int i = 0;i<top1;i++) {
				data[i] = temp[i];
			}
		}
		System.out.println("Pushing "+ x);
		data[++top1] = x;
	}
	// Removes the top most integer in the stack
	public int pop() {
		if(top1<0) {
			System.out.println("Array is empty exiting");
			System.exit(1);
		}
		System.out.println("Poping "+ data[top1]);
		return data[top1--];
	}
	// Returns True if stack is empty false if not
	public boolean isEmpty() {
		if(top1<0) {
			return true;
		}
		return false;
	}
	// lets you peek at the top integer
	public int peek() {
		if(!isEmpty())
			return data[top1];
		System.out.println("Stack is empty returning default value 0");
		return 0;
	}
	public static void main(String args[]) {
		Stack myStack = new Stack(10);
		for(int i=0;i<15;i++) {
			myStack.Push(i);
			//System.out.println("Test");
	}
		for(int i = 0;i<16;i++) {
			myStack.pop();
			//System.out.println("Test");
		}
	}
}

