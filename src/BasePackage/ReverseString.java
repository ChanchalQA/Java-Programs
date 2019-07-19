package BasePackage;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "My name is Chanchal";
		String	reverse ="";
		
		int len = str.length();
		
		System.out.println("length of String is "+ len);
		
		for(int i=len-1; i>=0; i--)
		{
		
			reverse = reverse + str.charAt(i);
			
			
		}
		
		System.out.println("Original string: "+ str);
		System.out.println("Reverse string: " + reverse);
	}

}
