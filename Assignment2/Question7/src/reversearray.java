import java.util.Stack;

public class reversearray {

	public void rev(int arr[]) {

		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			st.push(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=st.pop();
		}
	}
}
