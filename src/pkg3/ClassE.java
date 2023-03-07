package pkg3;

import java.util.Scanner;

public class ClassE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter salary :");
		int salary = scn.nextInt();
		
		System.out.println("Enter grade :");
		int grade = scn.nextInt();
		
		System.out.println("Enter year of experiance :");
		int experiance = scn.nextInt();
		
		if (grade>8)
		{
		if(experiance>5) {
			System.out.println(" You have get a bonus of 15% :");
			int bonus_salary;
			bonus_salary = 115*salary/100;
			System.out.println("your salary including bonus :"+bonus_salary);
			
		}
		}
		else {
			System.out.println("You will not get bonus :");
		}
		scn.close();
	}

}
