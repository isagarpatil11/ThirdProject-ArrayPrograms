package pkg3;

import java.util.Scanner;

public class ClassC {

	public static void main(String[] args) {
		// we have dimensions length and breadth decide it is square or rectangle
		Scanner scn = new Scanner(System.in);

		System.out.println( "enter lenght :");
		int lenght = scn.nextInt();
		System.out.println("enter breadth :");
		int breadth = scn.nextInt();
		if(lenght == breadth) {
			System.out.println("it is square");
		}
		else {
			System.out.println("it is rectangle");
		}
		scn.close();
	}

}
