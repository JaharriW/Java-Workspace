package cebyrdfootball.controller;

import cebyrdfootball.model.*;

public class TeamRunner
{

	public static void main(String[]args)
	{
		Team myTeam = new Team("Yellow Jackets",27.0,124,true);
		Team myTeam2 = new Team("Eagles",72.0,145,true);
	    System.out.println(myTeam);
		System.out.println(myTeam2);
		
	}
}
