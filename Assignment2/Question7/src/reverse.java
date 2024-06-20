

public class reverse {

	public static void main(String[] args) {
		int arr[]= {12,32,45,31,20};
		for(int num : arr) {
			System.out.println(num);
		}
		reversearray r=new reversearray();
		
		r.rev(arr);
		
		System.out.println("After sort");
		
		for(int num : arr) {
			System.out.println(num);
		}
	}

}
