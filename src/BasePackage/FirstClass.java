package BasePackage;

class A 
{

	public void funct1()
	{
		
		System.out.println("Function one executed");
	}
	
	public void funct2()
	{
		
		System.out.println("Function two executed");
	}
	
	
}

class B extends A
{
	public void funct3()
	{
		
		System.out.println("Function three executed");
	}
	
	public void funct4()
	{
		
		System.out.println("Function four executed");
	}
	
}

class C extends B
{
	public void funct5()
	{
		
		System.out.println("Function five executed");
	}
	
	public void funct6()
	{
		
		System.out.println("Function six executed");
	}
	
}



public class FirstClass extends C

{
	
public static void main(String args[])
{
	
	//A obj1=new A();
//	System.out.println("class A executed: Parent Class");
//	obj1.funct2();
//	obj1.funct1();
	
	
		/*
		 * B obj2=new B(); System.out.println("class B executed: Child class");
		 * 
		 * obj2.funct1(); obj2.funct2(); obj2.funct3(); obj2.funct4();
		 */
	
		/*
		 * C obj3=new C();
		 * 
		 * obj3.funct1(); obj3.funct2(); obj3.funct3(); obj3.funct4(); obj3.funct5();
		 * obj3.funct6();
		 */
	
	FirstClass f=new FirstClass();
	
	f.funct1();
	
}
	

}
