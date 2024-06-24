
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
		addNode(root,value);
	}
	public void addNode(Node trav,int value) {
		Node newnode=new Node(value);
		if(root==null) {
			root=newnode;
			return;
		}
		if(value<trav.data) {
			if(trav.left==null) {
				trav.left=newnode;
				return;
			}
			else {
				trav=trav.left;
				addNode(trav,value);
			}
		}
		else {
			if(trav.right==null) {
				trav.right=newnode;
				return;
			}
			else {
				trav=trav.right;
				addNode(trav,value);
			}
		}
	}
	public void inorder() {
		System.out.print("Inorder - ");
		inorder(root);
		System.out.println();
	}
	public void inorder(Node trav) {
		if(trav!=null) {
			inorder(trav.left);
			System.out.print(trav.data+" ");
			inorder(trav.right);
		}
	}
	
	public void postorder() {
		System.out.print("postorder - ");
		postorder(root);
		System.out.println();
	}
	public void postorder(Node trav) {
		if(trav!=null) {
			postorder(trav.left);
			postorder(trav.right);
			System.out.print(trav.data+" ");
		}
	}
	public void preorder() {
		System.out.print("preorder - ");
		preorder(root);
		System.out.println();
	}
	public void preorder(Node trav) {
		if(trav!=null) {
			System.out.print(trav.data+" ");
			preorder(trav.left);
			preorder(trav.right);
		}
	}
	
	public boolean search(Node trav,int value) {
		if(trav==null) {
			return false;
		}
		if(trav.data==value) {
			return true;
		}
		else if(trav.data<value) {
			return search(trav.right,value);
		}
		else {
			return search(trav.left,value);
		}
		//return false;
	}
	
	public boolean search(int value) {
		return search(root,value);
	}
}
