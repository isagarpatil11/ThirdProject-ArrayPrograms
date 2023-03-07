package pkg3;

import java.util.Scanner;

public class ClassG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Length :");
		int length = s.nextInt();
		
		System.out.println("Enter Breadth :");
		int breadth = s.nextInt();
		
		if(length == breadth)
		{
			System.out.println("its square");
		}
		else
		{
			System.out.println("its rectangle");
		}
s.close();
	}

}
