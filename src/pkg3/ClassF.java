package pkg3;

import java.util.Scanner;

public class ClassF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		
		System.out.println("enter digit :");
		
	   int a=4;
		
		switch(a)
		{
		case 1:
			System.out.println("low priority");
		    break;
		case 2:
		System.out.println("medium priority");
		    break;
		case 3:
			System.out.println("high priority");
			break;
			
	    default:
		    System.out.println("bug resolved");
		
		
	}

}}
