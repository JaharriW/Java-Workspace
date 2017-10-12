package MarshmellowMonster.model;

public class monsterClass 
{
	private double legs;
	private int eyes;
	private String name; 
	private boolean buttons;
	private int arms;
	
	
	public monsterClass()
	{
		legs = 0.0;
		eyes = 0;
		name = "";
		buttons = false;
		arms = 0;
		
		
	}
	
	public monsterClass(double legs, int eyes, String name, boolean buttons, int arms)
	{
		this.arms = arms;
		this.buttons = buttons;
		this.name = name;
		this.eyes = eyes;
		this.legs = legs;
		
	}
	
	public String toString()
	{
		
		
		str = name + " has " + arms + " arms, " + eyes + " eyes, and " + legs + " legs and also " + buttons + ".";
		if(buttons)
		{
			str = str + " has buttons";
		}
		else
		{
			str = str + "doesn't have buttons";
			
		}
		return str;
		
	}
	

}
