package BasePackage;

class T1
{

	 int x=10,  z;
	
	T1()
	{ int y=89;
		System.out.println("Constructor called");
		System.out.println("The value of y is===="+y);
	}
	
}

class T2 extends T1
{
	
	public void print()
	{
	System.out.println("The value of X is===="+x);
//	System.out.println("The value of y is===="+y);
	}
}

public class TestConst extends T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TestConst t=new TestConst();
		
		T2 obj=new T2();
		obj.print();
	//	obj.T1;

	}

}
 