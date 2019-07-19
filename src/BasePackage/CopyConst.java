package BasePackage;

class test //Copying values with constructor
{int i, j;
	
	test(int num1, int num2)
	{
		i=num1;
		j=num2;
	}
	
	test(test c)
	{
		i= c.i;
		j= c.j;
	}
	
	void display()
	{
		System.out.println("Value of num1: "+i);
		System.out.println("Value of num2: "+j);
	}
}

class test1 //Copying values without constructor
{
	int id;
	String name;
	test1(int i, String n)
	{
		id =i;
		name =n;
	}
	
	public test1() {
		// TODO Auto-generated constructor stub
	}
	void show()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
}

class cloneable //Copying values with clone()
{
	cloneable()
	{
		
	}
}


public class CopyConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test t=new test(10,15);
		t.display();

		test1 t1=new test1(101, "chanchal");
		test1 t2=new test1();
		
		t2.id=t1.id;
		t2.name=t1.name;
		
		t1.show();
		t1.show();
		}

}
