
public class MyQueue {
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
	
	public MyQueue(){
		head=null;
		tail=null;
	}
	
	public void offer(int value) {
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
	
	
	public void remove() {
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
	
	public void peek() {
		System.out.println(tail.data);
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
