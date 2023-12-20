package Oops;

public class Employee {
	int Empid;
	String EName;
	String EJob;
	int Esal;
   void display() 		
	{
	System.out.println(Empid);
	System.out.println(EName);
	System.out.println(EJob);
	System.out.println(Esal);
	}
	void show() 
	{
	System.out.println("honey");
	}

	public static void main(String[] args)
	{
		Employee Emp1=new Employee();
		Emp1.Empid=1345;
		Emp1.EName="sushma";
		Emp1.EJob="Tester";
		Emp1.Esal=100000;
		Emp1.display();
		Emp1.show();
		}



	}


