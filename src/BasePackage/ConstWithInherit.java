package BasePackage;

class add1
{
	int x; int z, res;
	add1()
	{
		//x=2;
		System.out.println("class A executed");
	}
}
class add2 extends add1
{
	int y;
	add2(int x1, int y1)
	{
	//	y=5;
		x = x1;
		y= y1;
		System.out.println("Class B executed");
	}
	
	add2(int x1, int y1, int z3)
	{
		x = x1;
		y= y1;
		z= z3;
		
	 res = x+y+z;
	
	}
	
	public void display()
	{
		System.out.println("Value of X & Y:  " + "X="+ x + " " +"Y="+ y);
		System.out.println("Result====" + res);
		
	}
}



public class ConstWithInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//add1 a1=new add1();
		add2 b1=new add2(10, 10, 10);
		add2 b2=new add2(4, 5);
		
		
	//	b1.x("10");
		b1.display();
		
	}

}
