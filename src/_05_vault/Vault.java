package _05_vault;

public class Vault {
	private int amountOfMoney;
	private int secretCode;
	
Vault(int amountOfMoney){
	this.amountOfMoney = amountOfMoney;
}
void setSecretCode(int secretCode)	{
	this.secretCode = secretCode;
}
boolean tryCode(int testCode)	{
	boolean guessCorrect;
	if(testCode==secretCode)	{
		guessCorrect=true;
	}
	else	{
		guessCorrect=false;
	}
	return guessCorrect;
}
void open(int code)	{
	if(code==secretCode)	{
		System.out.println("You unlocked the vault! The prize is $" + amountOfMoney + "!");
	}
	else	{
		System.out.println("INTRUDER!");
	}
}
}
