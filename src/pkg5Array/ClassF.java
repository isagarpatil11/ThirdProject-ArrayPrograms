package pkg5Array;

import java.util.Arrays;

public class ClassF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reverse The given Array
		
		int [] a = {12, 78, 36, 96, 112, 45};
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<(a.length/2); i++)
		{
			int k = a[(a.length-1) - i];
			a[(a.length-1) - i] = a[i];
			a[i] = k;
			
		}
		System.out.println(Arrays.toString(a));
		
	}

}
