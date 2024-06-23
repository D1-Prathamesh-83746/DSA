
public class Bst {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data=value;
			left=null;
			right=null;
		}
	}
	private Node root;
	
	public Bst() {
		root=null;
	}
	public void addNode(int value) {
		Node newnode=new Node(value);
		Node trav=root;
		if(root==null) {
			root=newnode;
			return;
		}
		while(true) {
		if(value<trav.data) {
			if(trav.left==null) {
				trav.left=newnode;
				break;
			}
			else {
				trav=trav.left;
			}
		}
		else {
			if(trav.right==null) {
				trav.right=newnode;
				break;
			}
			else {
				trav=trav.right;
			}
		}
		}
	}
	public void inorder() {
		inorder(root);
	}
	public void inorder(Node trav) {
		if(trav!=null) {
			inorder(trav.left);
			System.out.println(trav.data+" ");
			inorder(trav.right);
		}
	}
	
	public void postorder() {
		postorder(root);
	}
	public void postorder(Node trav) {
		if(trav!=null) {
			inorder(trav.left);
			System.out.println(trav.data+" ");
			inorder(trav.right);
		}
	}
	public void preorder() {
		preorder(root);
	}
	public void preorder(Node trav) {
		if(trav!=null) {
			inorder(trav.left);
			System.out.println(trav.data+" ");
			inorder(trav.right);
		}
	}
}
