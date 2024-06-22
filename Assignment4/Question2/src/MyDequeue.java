
public class MyDequeue {
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
	
	public MyDequeue(){
		head=null;
		tail=null;
	}
	
	public void offerfirst(int value) {
		Node newnode=new Node(value); 
		if(head==null && tail==null) {
			tail=newnode;
			head=newnode;
		}
		else{
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
	}
	public void offerlast(int value) {
		Node newnode=new Node(value);
		if(head==null && tail==null) {
			tail=newnode;
			head=newnode;
		}
		else {
		   newnode.prev=tail;
		   tail.next=newnode;
		   tail=newnode;
		}
	}
		
	public void pollfirst() {
		if(head==null) {
			System.out.println("Empty");
			return;
		}
		if(size()==1) {
			head=null;
			tail=null;
		}
		else {
			head.prev=null;
			head=head.next;
		}
	}
	
	public void polllast() {
		if(tail==null &&head==null) {
			System.out.println("Empty");
			return;
		}
		if(size()==1) {
			head=null;
			tail=null;
		}
		else {
			tail=tail.prev;
			tail.next=null;
		}
	}
	
	public void peekfirst() {
		System.out.println("first element - "+head.data);
	}
	public void peeklast() {
		System.out.println("last element - "+tail.data);
	}
	public void display() {
		Node trav=head;
		if(head==null) {
			System.out.println("Empty");
			return;
		}
		while(trav!=null) {
			System.out.print(" "+trav.data);
			trav=trav.next;
		}
		System.out.println();
	}
	
	public int size() {
		Node trav=head;
		if(head==null) {
			return 0;
		}
		int len=0;
		while(trav!=null) {
			len++;
			trav=trav.next;
		}
		return len;
	}
}
