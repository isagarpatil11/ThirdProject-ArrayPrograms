package pkg5Array;

import java.util.Arrays;
import java.util.Scanner;

public class classE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner s = new Scanner(System.in);
			
	      System.out.println("Enter array size : ");
	      int size = s.nextInt();
	      int[] a = new int[size];
	      
	      for(int i=0; i<size; i++)
	      {
	    	  System.out.println("enter your "+ (i+1) + " : ");
	    	  a[i] = s.nextInt();
	      }
	      System.out.println(Arrays.toString(a));
		
		
           //int[] a= {10,50,56,78,60,50};
   
   //Print Duplicate Value From Array  
      
        for(int i=0; i<(a.length-1); i++)
        {
    	  int count = 0;
    	  for(int j=i+1; j<a.length; j++)
    	  {
    		  if(a[i] == a[j])
    		  {
    			  count = count + 1;
    		  }
    	  }
    	  System.out.println(a[i] + "Repeated :" + count);
      }
          System.out.println(Arrays.toString(a));  
          
          
          
          
          
      
	}

}
