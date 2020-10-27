package _05_vault;

public class JamesBond {
JamesBond()	{
	
}
void findCode(Vault v)	{
	boolean codeCorrect = false;
	boolean codeCorrectFalse = true;
	for (int i = 0; i < 1000000; i++) {
		codeCorrect = v.tryCode(i);
		
		if(codeCorrect==true)	{
			System.out.println("The code is " + i);
			codeCorrectFalse = false;
			
		}
		
	}
	if(codeCorrectFalse == true)	{
		System.out.println(-1);
	
	}
}
}
