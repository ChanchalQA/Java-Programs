package BasePackage;

public class Number {

	public static void num(int i)
	{
		if(i>0)
		{
			
			num(i-1);
	
	
		}
		System.out.println(i);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			num(10);
	}

}
