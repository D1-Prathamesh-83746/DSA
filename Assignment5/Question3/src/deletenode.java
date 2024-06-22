
public class deletenode {
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
	
	public deletenode() {
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
	
	public Node[] searchwithparent(int key) {
		Node trav = root;
		Node parent = null;
		while (trav != null) {
			if (trav.data == key) {
				break;
			}
			parent=trav;
			if(trav.data<key) {
				trav=trav.right;
			}
			else {
				trav=trav.left;
			}
		}
		return new Node[] { trav, parent };
	}
	
	public boolean mysearch(int key) {
		Node arr[]=searchwithparent(key);
		Node trav=arr[0];

		if(trav==null) {
			return false;
		}
		return true;
	}
	
	public void delete(int key) {
		Node arr[]=searchwithparent(key);
		Node temp=arr[0];
		Node parent=arr[1];
		if(temp==null) {
			System.out.println("key not present ");
			return;
		}
		if(temp.left!=null && temp.right!=null) {
			Node pred=temp.left;
			parent=temp;
			
			while(pred.right!=null) {
				parent=pred;
				pred=pred.right;
			}
			
			temp.data=pred.data;
			
			temp=pred;
		}
		//single child on right side
		else if(temp.left==null) {
			if(temp==root) {
				root=temp.right;
			}
			else if(temp==parent.left) {
				parent.left=temp.right;
			}
			else if(temp==parent.right){
				parent.right=temp.right;
			}
		}
		
		//single child on left side
		else if(temp.right==null) {
			if(temp==root) {
				root=temp.left;
			}
			else if(temp==parent.left) {
				parent.left=temp.left;
			}
			else if(temp==parent.right) {
				parent.right=temp.left;
			}
		}
	}
}

