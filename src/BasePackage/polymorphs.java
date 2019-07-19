package BasePackage;

class parent
{
	parent()
	{
		System.out.println("parent constructor");
	}
	
	
protected void test1()
{
	System.out.println("This is the parent class method");
}

}

class child extends parent
{
	child()
	{
		System.out.println("child constructor");	
	}
	
	
public void test1()
{
	System.out.println("This is the child class method");
}

}

class polymorphs
{
	public static void main(String args[])
	{
		parent obj=new child();
		
		obj.test1();
		

		
	}
}

