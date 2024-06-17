
public class rank {

	public static void main(String[] args) {
		int arr[]= {10,2,15,3,4,4,1};
		int count=0;
		int key=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=key) {
				count++;
			}
		}
        System.out.println("Rank = "+count);
	}

}
