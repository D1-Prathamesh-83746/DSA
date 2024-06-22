
public class tester {

	public static void main(String[] args) {
		deletenode d=new deletenode();
		
		d.addNode(10);
		d.addNode(12);
		d.addNode(14);
		d.addNode(15);
		d.addNode(21);
		d.addNode(7);
		
		
		
		d.delete(11);
		
		d.inorder();
	}

}
