package BasePackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the 5 elements");
		
		 int[] arr = new int[5];
		 
		 int i, j;
		
		 for(i=0; i<5; i++) {
		  
		  arr[i] = Integer.parseInt(br.readLine());

		  }
		 
		 System.out.println();
		 
		 System.out.println("Elements of the array is: ");
		 
		 for(j = 0; j<i; j++) // arr[i] = 10  0<10
		  {
			  System.out.println(arr[j]);
		  }
		 
		 System.out.println();
		 
		 System.out.println("Reverse of the array is:");
		 
		  for(int k=i-1; k>=0; k--)
		  {
			 
			  System.out.println(arr[k] + " ");
		  }
		
	}

}


/*
 * int[] r = new int[40]; String[] name = new String[40];
 * 
 * for(int i=0;i<40;i++) { System.out.println("Enter the name of students");
 * name[i] = br.readLine(); }
 */