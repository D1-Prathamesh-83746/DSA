
 package sunbeam.com;

import java.util.Scanner;

public class Question2{
    
	public static int linear(int arr[],int key) {
		int index=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key) {
				index=i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int arr[]= {12,21,32,18,21,64};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key to be searched");
		int key=sc.nextInt();
		int index=linear(arr,key);
		System.out.println(index);
		sc.close();
	}

}
