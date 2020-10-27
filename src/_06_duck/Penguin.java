package _06_duck;

import java.util.Random;

public class Penguin {
private int age;
private String species;
private String name;

Penguin(int age, String name, String species){
	this.name = name;
	this.age = age;
	this.species = species;
}
void huntForFish()	{
	int numberOfFish = new Random().nextInt(10-0+1)+0;
	System.out.println(name + " the Penguin caught " + numberOfFish + "fish.");
}
void waddle()	{
	int waddled = new Random().nextInt(40-20+1)+20;
	System.out.println("Your penguin waddled approximately " + waddled + " inches.");
}
}
