import java.util.Arrays;

public class selection {

	public static void selection(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]={12,23,76,54,32,1};
		System.out.println("Before sort");
		System.out.println(Arrays.toString(arr));
		selection(arr);
		System.out.println("After sort");
		System.out.println(Arrays.toString(arr));
	}

}
