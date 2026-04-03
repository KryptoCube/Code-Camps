package BRR;

public class Palindromchecker {
	public static void main(String[] args) {
		String wort="OTTO";
		
		wort = wort.toLowerCase().replace("\\s+", "");
		String umgekehrt = new StringBuilder(wort).reverse().toString();
		
		if (wort.equals(umgekehrt))
			System.out.println("PALINDROM!");
		else 
			System.out.println("Kein Palindrom!");
	}
}
