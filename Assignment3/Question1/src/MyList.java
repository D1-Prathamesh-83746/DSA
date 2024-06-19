
public class MyList {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data=value;
			next=null;
		}
	}
	//private Node head;
	private Node tail;
	public MyList() {
		//head=null;
		tail=null;
	}
	public boolean IsEmpty() {
		return tail==null;
	}
	
	public void addFirst(int value) {
		Node newnode=new Node(value);
		if(IsEmpty()) {
			//head=newnode;
			tail=newnode;
			newnode.next=newnode;
		}
		else {
			newnode.next=tail.next;
			tail.next=newnode;
		}
	}
	public void addlast(int value) {
		Node newnode=new Node(value);
		if(IsEmpty()) {
			tail=newnode;
			newnode.next=newnode;
		}
		else {
			
			newnode.next=tail.next;
			tail.next=newnode;
			tail=newnode;
		}
	}
	public void addPosition(int value,int pos) {
		Node newnode=new Node(value);
		int length=myLength();
		if(pos<1 || pos>length+1) {
			System.out.println("Invalid position");
		}
		else if(IsEmpty()) {
			tail.next=newnode;
			tail=newnode;
			newnode.next=newnode;
		}
		else if(pos==1) {
			addFirst(value);
		}
		else {
			
			Node trav=tail.next;
			for (int i = 1; i < pos - 1; i++) {
	            trav = trav.next;
	        }
		    newnode.next=trav.next;
		    trav.next=newnode;
		    
		    
		}
	}
	public void deleteFirst() {
		if(IsEmpty()) {
			System.out.println("LL is Empty");
		}
		else {
		    tail.next=tail.next.next;
			//tail.next=head;
		}
	}
	
	public void deletelast() {
		if(IsEmpty()) {
			System.out.println("LL is Empty");
		}
		else {
			Node trav=tail.next;
			while(trav.next!=tail) {
				trav=trav.next;
			}
			trav.next=tail.next;
			tail=trav;
		}
	}
	public void deleteposition(int pos) {
		if(pos < 1 || pos > myLength()) {
			System.out.println("Invalid position");
			return;
		}
		
		if(IsEmpty())
			return;
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		else if(tail.next == tail)
			tail.next = tail = null;
		else {
			Node trav = tail.next;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			if(trav.next == tail)
				tail = trav;
			trav.next = trav.next.next;		
		}
	}
	public void display() {
		Node trav=tail.next;
		if(IsEmpty()) {
			System.out.println("EMPTY");
		}
		else {
		do {
			System.out.println(trav.data);
			trav=trav.next;
		}while(trav!=tail.next);
	}
	}
	
	public int myLength() {
		if(IsEmpty()) {
			return 0;
		}
		int length=1;
		Node trav=tail.next;
		while(trav.next!=tail.next) {
			length++;
	        trav=trav.next;
		}
		return length;
	}
}
