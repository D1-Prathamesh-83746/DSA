

public class linkedlist {
	
	static class Node{
		private int data;
		private Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	private Node head;
	
	public linkedlist() {
		head=null;
	}
	
	public boolean IsEmpty() {
		return head==null;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next=head;
		head=newnode;
	}
	
	public void addLast(int value) {
		Node newnode=new Node(value);
		
		if(IsEmpty()) {
			head=newnode;
		}
		else {
			Node trav=head;
			while(trav.next!=null)
				trav=trav.next;
			
			trav.next=newnode;
		}
		
	}
	public void addAtPosition(int value,int position) {
		if(position<=1) {
			addFirst(value);
		}
		Node newnode =new Node(value);
		Node prev=null;
		Node curr=head;
		
		while(position!=1) {
			position--;
			prev=curr;
			curr=curr.next;
		}
		prev.next=newnode;
		newnode.next=curr;
	}
	
	public void print(Node trav) {
		if(trav==null) {
			return;
		}
		print(trav.next);
		System.out.println(trav.data);
	}
	
	public void print() {
		print(head);
	}
	
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("LL is empty");
		}
		else {
			head=head.next;
		}
	}
	
	public void deleteLast() {
		if(head==null) {
			System.out.println("LL is empty");
		}
		else if(head.next==null) {
			head=null;
		}
		else {
			Node trav=head;
			while(trav.next.next!=null) {
				trav=trav.next;
			}
			trav.next=null;
		}
	}
	
	public void deleteAtPosition(int pos) {
		if(pos<=1) {
			deleteFirst();
		}
		Node pre=null;
		Node curr=head;
		while(pos!=1) {
			pos--;
			pre=curr;
			curr=curr.next;
		}
		pre.next=curr.next;
		curr=null;
	}
	
	
	public void mylength() {
		int count=0;
		Node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		System.out.println("LENGTH ="+count);
	}
	public void addPosition() {
		
		
	}
}
