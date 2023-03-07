package pkg3;

import java.util.Scanner;

public class ClassD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username = "sagarpatil278@gmail.com";
		String password = "Sagar123";
				
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Valid Email:");
		String username1 = scn.next();
		
		System.out.println("Enter Valid Password:");
		String password1 = scn.next();
		
		
		if(username.contains(username1) && password.contains(password1))
		{
			System.out.println("You have successfully Log_in");
		}
		else
		{
			System.out.println("wrong credential !!");
		}
		
		scn.close();
		
		
				
		


	}

}
