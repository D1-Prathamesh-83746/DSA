
public class linear {

	public static int occurance(int arr[],int key,int n) {
		int occ=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key && occ++==n) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,2,1,3,4,2,1};
		int key=3;
        System.out.println(occurance(arr,key,2));
	}

}
