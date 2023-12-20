package Oops;

public class Method_Overloading {
	class Adder{  
		
	}
		 static int add(int a,int b)
		{return a+b;}
		 static int add(int a,int b,int c)
		 {return a+b+c;}  
		}  
		class TestOverloading1{  

	public static void main(String[] args) {
		System.out.println(Oops.Method_Overloading.add(11,11));  
		System.out.println(Oops.Method_Overloading.add(11,11,11));  
		}


	}


