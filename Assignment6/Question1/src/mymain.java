
public class mymain {

	public static void main(String[] args) {
		heapsort h=new heapsort();
		int[] arr={11,34,76,98,4,2};
		h.addHeap(arr);
		
		System.out.print(h.heapSort(arr));
	}

}
