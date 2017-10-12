package cebyrdfootball.model;

public class Player extends Team 
{
	private String playerName;
	private int playerNumber;
	private double avgSpeed;
	private boolean fastPlayer;
	
	public Team()
	{
		playerName = "";
		playerNumber = 0;
		avgSpeed = 0.0;
		fastPlayer = false;
	}
	
	public Team(String playerName, int playerNumber, double avgSpeed, boolean fastPlayer)
	

}
