package BasePackage;

class Person
{
	static int data1=10;
	static int data2=20;
	Person(int i, int j)
	{
		data1 = i;
		data2 = j;
		
		System.out.println(i+"    "+ j);
		
		System.out.println("This is person class constructor");
	}
}

class Student extends Person
{
	Student()
	{
		super(data1, data2);
		System.out.println("This is student class constructor");
	}
}

public class TestSuper {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student s = new Student();
	}

}