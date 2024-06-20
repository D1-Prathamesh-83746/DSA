
public class mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MyList m=new MyList();
         m.addFirst(10);
         m.addFirst(20);
         m.addFirst(30);
         m.addFirst(40);
         m.addFirst(50);
         m.addAtPosAfter(11, 2);
         m.print();
	}

}
