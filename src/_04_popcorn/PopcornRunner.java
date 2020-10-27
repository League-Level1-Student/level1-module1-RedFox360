package _04_popcorn;

import java.util.Scanner;

public class PopcornRunner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What flavor of popcorn do you want?");
		String flavor = scan.nextLine();
		System.out.println("How long would you like to cook the popcorn?: ");
		int cookTime = scan.nextInt();
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		microwave.setTime(cookTime);
		microwave.startMicrowave();
		
	}
}
