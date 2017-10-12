package stringmanipulation.controller;
import java.util.Scanner;

public class StringCommands 
{
	Scanner myScanner = new Scanner(System.in);
	
	
	public StringCommands()
	{
		
	}
	
	public void jimmy()
	{
		System.out.println("Enter your name:");
		String reply = myScanner.nextLine();
		if (reply.equalsIgnoreCase("Jimmy"))
		{
			System.out.println("Hi Jimmy");
		}
		else
		{
			System.out.println("I dont know you");
		}
		
	}
	
	public String orToOur(String word)
	{
		String result = "";
		if (word.endsWith("or"))
		{
			word = word.substring(0,word.length()-2);
			word = word.concat("our");
			result = word;
		}
		else
		{
			result = word;
		}
		return result;
	}
}
