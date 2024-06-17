
public class linearcount {

	public static int linearComp(int arr[],int key) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count++;
			if(arr[i]==key) {
				return count;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {12,21,23,67,54,38,98};
		int key=98;
		System.out.println("count = "+linearComp(arr,key));
	}

}
