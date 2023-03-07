package pkg4;

public class ClassE {

	public static void main(String[] args) {
		
		//Star pattern
		
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print("  ");
			}
			
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
