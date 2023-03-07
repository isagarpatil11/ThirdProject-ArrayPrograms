package pkg4;

public class ClassB {

	public static void main(String[] args) {
		// Nested for loop
             //outer for loop
		for(int i=0; i<5; i++)
		{
			System.out.println("====outer loop :" + i + "=====");
			for(int j=0; j<5; j++)                            //inner for loop
			{
				System.out.println("inner loop :" +j);
			}
			System.out.println();
		}
	}

}
