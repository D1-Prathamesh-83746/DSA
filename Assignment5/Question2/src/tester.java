
public class tester {

	public static void main(String[] args) {
		Bst b=new Bst();
		b.addNode(12);
		b.addNode(3);
		b.addNode(1);
		b.addNode(6);
		b.addNode(4);
		b.addNode(7);
		b.addNode(10);
		b.addNode(14);
		b.addNode(13);
		
		b.inorder();
		b.preorder();
		b.postorder();
		
		if(b.search(10)==true) {
			System.out.println("Present");
		}
		else {
			System.out.println("Absent");
		}
	}

}
