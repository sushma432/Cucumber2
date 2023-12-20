package Oops;

public class Emp1 {
 int Id;
 String Name;
 String Job;
 int Sal;
 Emp1(int Id,String Name,String Job,int Sal) {
	 this.Id = Id;
	 this.Name = Name;
	 this.Job = Job;
	 this.Sal = Sal;
	 
 }
 void display() {
	 System.out.println(Id);
	 System.out.println(Name);
	 System.out.println(Job);
	 System.out.println(Sal);

 }
 void show() {
	 System.out.println("Honey");
 }
 
	public static void main(String[] args) {
		Emp1 emp1=new Emp1(3,"sushma","tester",35000);
		emp1.display();
		emp1.show();
		
	}

}
