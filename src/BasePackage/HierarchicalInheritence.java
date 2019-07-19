package BasePackage;
	
	class C1
	{
		
		public void f()
		{
			System.out.println("This is a parent class");
		}
	}
	
	class C2 extends C1
	{
		public void f1()
		{
			System.out.println("This is sub class 1");
		}
	}
	
	class C3 extends C2
	{
		public void f2()
		{
			System.out.println("This is sub class 2");
		}
	}
	
	
public class HierarchicalInheritence extends C3 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HierarchicalInheritence test=new HierarchicalInheritence();
		
	test.f();
	test.f1();
		test.f2();
		
		
	}

}
