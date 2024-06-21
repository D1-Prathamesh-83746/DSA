
public class myfunc {
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
	private int count=0;
	
	public myfunc(){
		head=null;
		tail=null;
	}
	
	public void addfirst(int value) {
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
	public void addlast(int value) {
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
	public void addposition(int value,int pos) {
		Node newnode=new Node(value);
		Node trav=head;
		if(head==null && tail==null) {
			tail=newnode;
			head=newnode;
		}
		else if(pos==1) {
			addfirst(value);
		}
		else if(pos>=size()) {
			addlast(value);
		}
		else {
			while(pos!=1) {
				trav=trav.next;
				pos--;
			}
			Node ptrav=trav.prev;
			ptrav.next=newnode;
			newnode.prev=ptrav;
			newnode.next=trav;
			trav.prev=newnode;
			
		}
		
	}
	
	public void deletefirst() {
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
	
	public void deletelast() {
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
	
	public void deletepos(int pos) {
		Node trav=head;
		if(tail==null &&head==null) {
			System.out.println("Empty");
			return;
		}
		if(size()==1) {
			head=null;
			tail=null;
		}
		else {
			while(pos!=1) {
				trav=trav.next;
				pos--;
			}
			Node nodenext=trav.next;
			Node nodeprev=trav.prev;
			
			nodenext.prev=nodeprev;
			nodeprev.next=nodenext;
		}
	}
	
	public void display() {
		Node trav=head;
		if(head==null) {
			System.out.println("Empty");
			return;
		}
		while(trav!=null) {
			System.out.println(trav.data);
			trav=trav.next;
		}
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
	
	/*
	 * public void insert(int value) { Node newnode=new Node(value); Node trav=head;
	 * if(head==null && tail==null) { count++; head=newnode; tail=newnode; }
	 * if(head==tail && head!=null) { count++; if(value>head.data) { addlast(value);
	 * } else if(value<head.data) { addfirst(value); } } else { int pos=0;
	 * while(trav.next.data<value) { pos++; trav=trav.next; } addposition(value,
	 * pos); }
	 * 
	 * 
	 * }
	 */
	void insertSorted(int data) {
        Node newNode = new Node(data);

        // If the list is empty or the new node should be placed at the head
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Find the correct position to insert the new node
        Node current = head;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }

        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;
    }
}
