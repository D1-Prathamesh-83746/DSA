
public class myMain {

	public static void main(String[] args) {
		MyDequeue d=new MyDequeue();
		d.offerfirst(12);
		d.offerfirst(22);
		
		d.display();
		
		d.offerlast(40);
		d.offerlast(50);
		
		d.display();
		
		d.peekfirst();
		d.peeklast();
		
		d.pollfirst();
		d.polllast();
		d.display();

	}

}
