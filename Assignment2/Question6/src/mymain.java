
public class mymain {

	public static void main(String[] args) {
		myStack st=new myStack(5);
		st.push(100);
		st.push(110);
		st.push(120);
		st.display();
		System.out.println("max is");
		st.maxi();
	}

}
