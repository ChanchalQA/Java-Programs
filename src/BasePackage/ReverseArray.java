package BasePackage;

import java.util.Scanner;

public class ReverseArray {
  
  public static void main(String[] args) { // TODO Auto-generated method stub
  
  //int n = 5;
  
	  @SuppressWarnings("resource")
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter number of elements");
	  
	  int n = s.nextInt();
	  int[] arr = new int[n];
  
	  System.out.println("Enter the elements");
	  
	  for(int i=0;i<n;i++)
	  {	//for reading array
          arr[i]=s.nextInt();
      }

      for(int i: arr)
      { //for printing array
          System.out.println(i);
      }
  
      
      
      
  }
}
 