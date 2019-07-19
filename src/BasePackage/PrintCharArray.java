package BasePackage;

public class PrintCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Chanchal"; // split string character using toCharArray()
		
		System.out.println("Original String: " + s);
		
		char[] c = s.toCharArray();
		int len1 = c.length;
		
		for(int i=0; i<len1; i++)
		{
			System.out.println(c[i]);
		}
		
		
		String s1= "Selenium";			// split string character using charAt()
		System.out.println("Original String: " + s1);
		
		int len = s1.length();
		
		for(int j=0; j<len; j++)
		{
			char c1 = s1.charAt(j);
			
			System.out.println(c1);
		}
		
		String s2 = "Hello World";  // split string/sentence
		
		String[] part = s2.split(" ");
		
		int len2 = part.length;
		
		for(int k= 0; k<len2; k++)
		{
			System.out.println(part[k]);
		}
		
		
	}

}
