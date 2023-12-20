package Oops;

public class Method_Overriding
{
   void showA()
   {
	   System.out.println("login");
   }
   void showB()
   {
	   System.out.println("tester");
	   
   }
   void showC()
   {
	   System.out.println(17);
   }
	public static void main(String[] args)
	{
		Method_Overriding Over=new Method_Overriding();
		Over.showA();
		Over.showB();
		Over.showC();

	}

}
