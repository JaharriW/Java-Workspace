package stringmanipulation.controller;

public class Runner
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		StringCommands myProgram = new StringCommands();
		
		// System.out.println(myProgram.orToOur("flavor"));
		
		
		WordReverser myReverser = new WordReverser();
		System.out.print(myReverser.reverse("Racecar"));
		

	}

}
