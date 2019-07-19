package BasePackage;

public class ArrayConcept {

	public static void main(String arg[])
	{
		
	int[] arr= new int[5];

	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;
	arr[3] = 40;
	arr[4] = 50;
	//arr[5] = 50;
	
	System.out.println(arr[4]);
	System.out.println("Size of the array: "+arr.length);
	
	for(int i=arr.length-1; i>0; i--)
	{
		System.out.println(arr[i]);
		//System.out.println(arr[5]);
	}
	
	for(int i=0; i<arr.length; i++)
	{
		System.out.println(i);
		
	}
	
	}
}
