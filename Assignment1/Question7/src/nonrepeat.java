
public class nonrepeat {

	public static void main(String[] args) {
		int arr[]= {1,2,13,1,2,13,0,4,-1,7,8};
		
		for(int i=0;i<arr.length;i++) {
			int temp=-1;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					temp++;
				}
			}
			if(temp==0) {
				System.out.println(arr[i]);
				System.exit(1);
			}
		}

	}

}
