
public class myStack {
	private int arr[];
	private int top;
	private int size;
	
	public myStack(int len) {
		arr=new int[len];
		top=len;
		size=len;
	}
	
	public void push(int value) {
        if (top == 0) {
            System.out.println("FULL");
        } else {
            // Ensure descending order
            if (top == size || value < arr[top]) {
                top--;
                arr[top] = value;
            } else {
                System.out.println("Error: New element must be smaller than the current top element");
            }
        }
    }
	
	public void pop() {
		if(top==-1) {
			System.out.println("empty");
			return;
		}
		arr[top]=-1;
		top--;
	}
	public void peek() {
		if(top==-1) {
			System.out.println("empty");
			return;
		}
		System.out.println(arr[top]);
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(" "+arr[i]);
		}
	}
}
