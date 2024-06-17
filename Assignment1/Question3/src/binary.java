
public class binary {

	public static int binaryComp(int arr[],int key) {
		int s=0,e=arr.length-1;
		int mid=s+(e-s)/2;
		int count=0;
		while(s<e) {
			if(arr[mid]==key) {
				count++;
				return count;
			}
			else if(key<arr[mid]) {
				count++;
				e=mid-1;
			}
			else {
				count++;
				s=mid+1;
			}
		}
		System.out.println("print something");
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {12,21,23,67,54,38,98};
		int key=98;
		System.out.println("print something");
		int count=binaryComp(arr,key);
		System.out.println(count);
	}

}
