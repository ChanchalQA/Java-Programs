package BasePackage;

enum Name
{
	chanchal, akhil, nikhil;
	
}

public class testEnum  {
	
	Name name1;
	
	testEnum(Name name1)
	{
		this.name1 = name1;
	}
	
	public void display()
	{
		switch(name1)
		{
		
		case chanchal:
			System.out.println("Chanchal is eldest one");
			break;
		
		case nikhil:
			System.out.println("Nikhil is elder Brother");
			break;
			
		case akhil:
			System.out.println("Aikhil is younger Brother");
			break;
			
		default:
			
		System.out.println("Only these three are there");	
		
		}
		
	}
	
	public static void main(String args[])
	{
		/*
		 * Name n1= Name.nikhil;
		 * 
		 * System.out.println(n1.toString());
		 */
			
			String str = "chanchal";
			testEnum t1=new testEnum(Name.valueOf(str));
			t1.display();
			
			
		
	}

}
