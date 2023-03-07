package pkg4;

public class ClasssF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Armstrong number
		
		
		
		int num;
		int num1;
		int total = 0;
		System.out.println("Armstrong number from 1 to 1000");
		
		for(int i=1; i<=1000;i++)
		{
			num = i;
			while(num>0)
			{
				num1 = num % 10;
				total = total + (num1*num1*num1);
				
				num = num /10;
			}
			if(total==i)
			{
				System.out.println(i);
			}
			total=0;
			}
		}
		
		
	}

