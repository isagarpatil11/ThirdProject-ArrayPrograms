package pkg;

public class Airtel {
	
		int datapack1 = 499;
		int datapack2 = 699;
		
		int voicepack1 = 99;
		int voicepack2 = 149;
		
		public void combopack1()
		{
			int combo1 = datapack1 + voicepack1;
			System.out.println("recharge with:"+ combo1);
		}
		public void combopack2() 
		{
			int combo2 = datapack2 + voicepack2;
			System.out.println("recharge with:"+combo2);
		}

}
