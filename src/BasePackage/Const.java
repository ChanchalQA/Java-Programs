package BasePackage;

class TestConst1
{
	int i, j;

	TestConst1()
	{
		
//		i=ii;
//		j=jj;
//		
		System.out.println("i==="+i+"j==="+j);
		
		System.out.println("constuctor 1 called");
	}
	
	
}

class B11 extends TestConst1

{
	int i, j;
	B11(int ii, int jj)
	{
		i=ii;
		j=jj;
		System.out.println("constuctor 2 called");
	}
	
}

public class Const {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TestConst1 obj=new TestConst1(0, 0);

		//new B11(0, 0);
		new TestConst1();
	}

}
