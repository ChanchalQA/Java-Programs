package BasePackage;

public class SpecialNumber1 {
	
	static int findSmallest(int a[], int n)
	{
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(a[i] % a[j] >= 1)
					break;
				
				if(j == n)
					return a[i];
				
			}
			
		}
		return -1;	
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		int a[] = {25, 20, 30, 5, 10, 30};
		int n= a.length;
		System.out.println(findSmallest(a, n));
	}
}
