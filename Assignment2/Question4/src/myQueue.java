
public class myQueue {
	private int front=0;
	private int rear=0;
	private final int SIZE;
	private int arr[];
	
	public myQueue(int size) {
		SIZE=size;
		arr=new int[SIZE];
		front=rear=-1;
	}
	public boolean IsFull() {
		return rear==SIZE-1;
	}
	
	public boolean IsEmpty() {
		return front==rear;
	}
		public void push(int value) {
			if(rear==SIZE-1) {
				System.out.println("full");
			}
			else if(front==-1 && rear==-1) {
				front++;
				rear++;
				arr[rear]=value;
			}
			else {
				rear++;
				arr[rear]=value;
			}
	}
		public void pop() {
			if(front==-1 && rear==-1) {
				System.out.println("Queue underflow");
			}
			else if(front==rear) {
				arr[front]=-1;
				rear=-1;
				rear=-1;
			}
			else {
				arr[front]=-1;
				front++;
			}
		}
		public void peek() {
			if(front==-1) {
				System.out.println("Empty");
			}
			else {
				System.out.println(arr[front]);
			}
		}
		public void display() {
			for(int i=front;i<=rear;i++) {
				System.out.println(" "+arr[i]);
			}
		}
}

