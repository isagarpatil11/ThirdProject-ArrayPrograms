package pkg3;

public class ClassB {

	public static void main(String[] args) {
		// Take age of three people and determine oldest and youngest
		
		int p1 = 55;
		int p2 = 65;
		int p3 = 54;
		
		if(p1>p2)     //p1>p2
		{
			if(p1>p3)     //p1>p2     p1>p3
			{
			System.out.println("p1 is oldest");
			if(p2>p3)
			{
				System.out.println("p3 is youngest");
			}
			else 
			{
				System.out.println("p2 is youngest");
			}
		    }
			else {                 //p1>p2   p1<p3  -->p3>p1>p2
				System.out.println("p3 is oldest");
				System.out.println("p2 is youngest");
			}
    	}
		else {             //p1<p2
			if(p2>p3)      //p2>p1  p2>p3
			{
				System.out.println("p2 is oldest");
				if(p1>p3)
				{
					System.out.println("p3 is youngest");
				}
				else 
				{
					System.out.println("p1 is youngest");
				}
			}
			else          //p2<p3   p1<p2   -->p3>p2>p1
				{
			   System.out.println("p3 is oldest ");
			   System.out.println("p1 is youngest");
		}
}
	}}
