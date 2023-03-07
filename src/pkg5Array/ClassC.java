package pkg5Array;

import java.util.Arrays;

public class ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sort Array in increasing order i.e. ascending order
		
		int[] b= {500, 27, 120, 56, 88};
		
		//{27,56,88,120,500}
		
		for(int i=0; i<b.length; i++)
		{
			for(int j=i+1; j<b.length; j++)
			{
				if(b[j] < b[i])
				{
					int k = b[j];
					
					 b[j] = b[i];
					 
					 b[i] = k;
				}
			}
		}
         System.out.println(Arrays.toString(b));
	}

}
