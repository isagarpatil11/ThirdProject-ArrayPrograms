package pkg5Array;

import java.util.Arrays;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] b = new int[5];
		
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		System.out.println(b[3]);
		
		System.out.println(b.length);
		System.out.println("============================");
		
		String[] c = {"Velocity","is","in","Katraj"};
		
		System.out.println(c[3]);
		
		System.out.println(c.length);
		
		System.out.println("==============================");
		
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]+" ");
		}
		System.out.println();
		System.out.println("==============================");
		
		System.out.println(Arrays.toString(b));
				
		

}
	}
