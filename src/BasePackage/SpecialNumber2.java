package BasePackage;

public class SpecialNumber2 {
	
	static int findSmallest(int a[], int n)
	{
		for(int i=0; i<=n-1; n++)
		{
			System.out.println(a[i]);
			
		}
		
	return n;
	}
	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		int a[] = {25, 20, 30, 5, 10, 30};
		
		int n= a.length;
		System.out.println(findSmallest(a, n));
		
	}

}