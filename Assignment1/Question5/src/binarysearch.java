
public class binarysearch {

	public static int binarysearch1(int arr[],int key) {
		int s=0,e=arr.length-1;
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key<arr[mid]) {
				s=mid+1;
			}
			else {
				e=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {60,50,40,30,20,10};
		int key=60;
		System.out.println(binarysearch1(arr,key));
	}

}
