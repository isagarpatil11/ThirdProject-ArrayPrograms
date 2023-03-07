package pkg;

public class Jio {
    
	int datapack1 = 599;
	int datapack2 = 999;
	
	int voicepack1 = 99;
	int voicepack2 = 199;
	
	public void combopack1()
	{
		int combo1 = datapack1 + voicepack1;
		System.out.println("Recharge with:"+combo1);
	}
	public void combopack2()
	{
		int combo2 = datapack2 + voicepack2;
		System.out.println("Recharge with:"+combo2);
	}
	
}
