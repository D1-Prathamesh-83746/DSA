
public class doubly {
	static class Node{
		private Node next;
		private Node prev;
		private  int data;
		
		public Node(int value){
			next=prev=null;
			data=value;
		}
	}
	
	private Node head;
	private Node tail;
	
	public doubly(){
		head=tail=null;
	}
	
	public void addfirst(int value) {
		Node newnode=new Node(value);
		if(head==null && tail==null) {
			tail=newnode;
			head=newnode;
		}
		else{
			newnode.next=head;
			
		}
	}
}
