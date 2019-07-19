package BasePackage;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int outer=0; outer<5; outer++)
		{
			System.out.println("Outer: " + outer);
			
				for(int inner=0; inner<5; inner++)
				{
					
					System.out.println("Inner: " + inner);
					
					break;
				}
				//System.out.println("Outer: " + outer);
				
		}
		
		System.out.println("------------------------------Patter1-----------------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("1");
			}
			
			System.out.println();
			
		}
		
		System.out.println("------------------------------Patter2-----------------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------Patter3-----------------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");		
			}
			
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}	
			
			System.out.println(); 
		}
		
		System.out.println("------------------------------Patter4-----------------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			
			for(int l=2; l<=i; l++)
			{
				System.out.print("*");
			}
			
			System.out.println(); 
		}
		
		System.out.println("------------------------------Patter5-----------------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			
			for(int l=2; l<=i; l++)
			{
				System.out.print("*");
			}
			
			
			System.out.println(); 
		}
		
		for(int m=1; m<=4; m++)
		{
			
			for(int p=4; p>=m; p--)
			{
				System.out.print("*");
			}
			
			System.out.println("");

			for(int n=1; n<=m; n++)
			{
				System.out.print(" ");
			}
			
			for(int q=4; q>=m; q--)
			{
				System.out.print("*");
			}
		}
		
		
	}

}
