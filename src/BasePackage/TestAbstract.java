package BasePackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Teacher
{
	static void t1(String tname)
	{
		//System.out.println("static method executed");
		System.out.println("Tecaher Name is: " + tname);
	}
}

class TStudent  
{
	String sname = null, course = null;
	int rollno;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public void getdata() throws IOException
	{
		//System.out.println("Enter the Student Name, Course, Roll No: ");
		
		for(int i=0; i<=2; i++)
		{
			
		System.out.println("Enter the Student Name, Course, Roll No: ");
		sname =	br.readLine();
		course = br.readLine();
		rollno = Integer.parseInt(br.readLine());
		
		System.out.println(sname);
		System.out.println(course);	
		System.out.println(rollno);	
		Teacher.t1("Chanchal");
		}
		
	}
	
	/*
	 * public void display() { System.out.println(sname);
	 * System.out.println(course); System.out.println(rollno); }
	 */
	
}

public class TestAbstract {	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//Teacher.t1("Chanchal");
		
		TStudent obj =new TStudent();
		obj.getdata();
		//obj.display();
		
		
	}

}
