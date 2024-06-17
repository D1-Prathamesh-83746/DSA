import java.util.Arrays;

public class Binarysearch {

	public static int binaryComp(int arr[],int key) {
		int s=0,e=arr.length-1;
		
		int count=0;
		while(s<e) {
			int mid=s+(e-s)/2;
			count++;
			if(arr[mid]==key) {
				return count;
			}
			else if(key<arr[mid]) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {12,21,23,67,54,38,98,121,134,176,183,196};
		int key=67;
		Arrays.sort(arr);
		int count=binaryComp(arr,key);
		System.out.println(count);
	}

}
