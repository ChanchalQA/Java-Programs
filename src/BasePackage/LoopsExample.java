package BasePackage;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------while loop with incremental approach----------------");
		
		int i=0;
		
		while(i<=10) //while loop with incremental approach
		{
			//i++;
			System.out.println(i);
			i++;
		}
		
		System.out.println("---------------while loop with decremental approach----------------");
		
		int j=10;
		while(j>=0)  //while loop with decremental approach
		{
			
			System.out.println(j);
			j--;
		}
		
		System.out.println("---------------For loop with incremental approach----------------");
		
		for(int k=0; k<=10; k++) //for loop with incremental approach
		{
			System.out.println(k);
		}
		
		System.out.println("---------------For loop with decremental approach----------------");

		for(int p=10; p>=0; p--)
		{
			System.out.println(p);
		}
		
	}

}
