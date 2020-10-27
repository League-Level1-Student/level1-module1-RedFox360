package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar racecarf = new RaceCar("Ferrari", 5);
		// 2. Print the RaceCar's position in the race
		int positionOfF = racecarf.getPositionInRace();
		System.out.println(positionOfF);
		// 3. Crash the RaceCar
		racecarf.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if(racecarf.isDamaged()==true)	{
		racecarf.pit();
		}
		// 5. Help the car move into first place.
		boolean overtake = true;
		while(overtake)	{
			racecarf.overtake();
			positionOfF = racecarf.getPositionInRace();
			if(positionOfF==1) {
				overtake=false;
			}
		}
		System.out.println("You are in first place!!");
	}
}
