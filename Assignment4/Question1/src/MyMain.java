import java.util.Queue;

public class MyMain {

	public static void main(String[] args) {
		doubly d=new doubly();
		d.push(10);
		d.push(20);
		d.push(30);
		
		d.display();
		System.out.println("-------------");
		d.pop();
		d.display();
		d.peek();
		
		MyQueue q=new MyQueue();
		q.offer(20);
		q.offer(60);
		q.peek();
		q.remove();
		q.display();
	}

}
