package pkg2;

public class Airtel1 {
	
	
	public static int datapack1 = 499;
	public static int datapack2 = 699;
	
	static int voicepack1 = 99;
	static int voicepack2 = 149;
	
	protected void combopack1()
	{
		int combo1 = datapack1 + voicepack1;
		System.out.println("recharge with:"+ combo1);
	}
	protected static void combopack2() 
	{
		int combo2 = datapack2 + voicepack2;
		System.out.println("recharge with:"+combo2);
	}

}
