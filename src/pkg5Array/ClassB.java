package pkg5Array;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] b = {500, 27, 120, 56, 88};
	
           //Print largest number from given Array
		
		int maxNumber = b[0];
		
		for(int i=1; i<(b.length); i++)
		{
			if(maxNumber < b[i])
			{
				maxNumber = b[i];
			}
		}
		System.out.println(maxNumber);
		
		//Print smallest number from given Array
		int minNumber = b[0];
		
		for(int i=1; i<(b.length); i++)
		{
			if(minNumber >b[i])
			{
				minNumber = b[i];
			}
		}
		System.out.println(minNumber);
	}

}
