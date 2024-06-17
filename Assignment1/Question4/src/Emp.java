import java.util.Scanner;

public class Emp {

	public static class Employee{
		private int empid;
		private String name;
		private double salary;
		public Employee() {
			
		}
		public Employee(int empid, String name, double salary) {
			this.empid = empid;
			this.name = name;
			this.salary = salary;
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		@Override
		public String toString() {
			return "Employee [" +empid +" , " +name +" , " +salary +"]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}	
	}
	
	public static String searchbyid(Employee arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].empid==key) {
				return arr[i].toString();
			}
		}
		return "Absent";
	}
	public static String searchbyname(Employee arr[],String key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].name.equals(key)){ 
				return arr[i].toString();
			}
		}
		return "Absent";
	}
	public static String searchbysalary(Employee arr[],double key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].salary==key) {
				return arr[i].toString();
			}
		}
		return "Absent";
	}
	public static int menu(Scanner sc) {
		System.out.println("0.EXIT");
		System.out.println("1.Seach by ID");
		System.out.println("2.Search by NAME");
		System.out.println("3.Search by SALARY");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		Employee[] e=new Employee[5]; 
		e[0]=new Employee(18,"virat",2500);
		e[1]=new Employee(45,"rohit",7500);
		e[2]=new Employee(7,"mahi",5500);
		e[3]=new Employee(99,"ashwin",9500);
		e[4]=new Employee(8,"jadeja",500);
        Scanner sc=new Scanner(System.in);
        int choice;
        
		while((choice=menu(sc))!=0) {
			switch (choice) {
			case 1:
				System.out.println("enter id to search..");
				System.out.println(searchbyid(e,sc.nextInt()));
				break;
			case 2:
				System.out.println("enter name to search..");
				System.out.println(searchbyname(e,sc.next()));
				break;
			case 3:
				System.out.println("enter salary to search..");
				System.out.println(searchbysalary(e,sc.nextDouble()));
				break;
			default:
				System.out.println("invalid entry");
				break;
			}
		}
		sc.close();	
	}
}
