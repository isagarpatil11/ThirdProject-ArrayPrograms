package pkg4;

public class ClassD {
	public static void main(String[] args) {
		//while loop
		
		int a = 10;
		while(a>=2)                           //while loop
		{
			
			System.out.println(a);
			a = a/3;
		}
		System.out.println("reminder: "+ a);
		
		
		
		
		int m = 10;                           //do while loop
		do {
			System.out.println(m);
			m = m/3;
		}while(m>=1);
		
		
		    int sum = 0;                                 //continue
		    for(int i=1; i<=10; i++)
		    {
		    	if(i == 8)
		    	{
		    		continue;
		    	}sum = sum + i;
		    	
		    }
			
	}

}
