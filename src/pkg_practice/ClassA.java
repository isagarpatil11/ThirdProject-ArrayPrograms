package pkg_practice;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		// PRIME NUMBER
		
	   Scanner scn=new Scanner(System.in);
	   System.out.println("Enter the Number: ");
		int number=scn.nextInt();


	//	int number = 7;
		int temp = 0;
		
		for(int i=2; i<=number-1; i++)
		{
			if(number%i == 0)
			{
				temp= temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println(number +":is prime Number");
		}
		else
		{
			System.out.println(number + ": is not prime number");
		}
	}

}
