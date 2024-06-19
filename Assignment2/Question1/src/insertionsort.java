import java.util.Arrays;

public class insertionsort {

	public static void insertion(int arr[]) {
		int count=0;
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
				count++;
			}
			arr[j+1]=key;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int arr[]= {44,33,55,22,11};
		System.out.println("array before sort");
		System.out.println(Arrays.toString(arr));
		
		insertion(arr);
		
		System.out.println("array after sort");
		System.out.println(Arrays.toString(arr));

	}
}