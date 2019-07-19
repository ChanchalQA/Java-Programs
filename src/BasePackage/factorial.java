package BasePackage;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Chanchal";
		String reverse = "";
	//int	len= str.length();
	
	for(int i = str.length(); i>=0; i++)
	{
		reverse = reverse +str.charAt(i);
		System.out.println(reverse);
	}
	}

}


