package _05_vault;

public class Runner1 {
public static void main(String[] args) {
	Vault v = new Vault(1000000);
	JamesBond j = new JamesBond();
	v.setSecretCode(12345);
	j.findCode(v);
	v.open(12345);
}
}
