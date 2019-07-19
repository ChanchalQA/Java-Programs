package BasePackage;

class Person1
{
	static int data1=10;
	int data2=20;
	Person1(int i, int j)
	{
		data1 = i;
		data2 = j;
		
		System.out.println(i + j);
		
		System.out.println("This is person class constructor");
	}
}

class Student1 extends Person
{
	Student1()
	{
		super(data1, data2);
		System.out.println("This is student class constructor");
	}
}

public class superClassTest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student1 s = new Student1();
	}

}
