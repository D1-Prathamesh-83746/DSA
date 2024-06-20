
public class MyMain {
	public static void main(String[] args) {
		myStack st=new myStack(5);
		st.push(12);
		st.push(24);
		st.push(4);
		System.out.println("-----------------");
		st.peek();
		System.out.println("-----------------");
		st.push(22);
		st.push(44);
		st.display();
		System.out.println("-----------------");
		st.pop();
		st.display();
		st.peek();
	}

}
