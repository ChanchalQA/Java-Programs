package BasePackage;

interface TestIF
{
	int a= 0;
	 void f();
	
}

class bInter
{
	
}

public class TestClass  extends bInter implements TestIF{

	
	
	  @Override public void f() { // TODO Auto-generated method stub
	  
	  
	  
	  System.out.println(a); }
	  
	 
	public static void main(String[] args) {
		
		TestClass t1=new TestClass();
		t1.f();

	}

	
}
