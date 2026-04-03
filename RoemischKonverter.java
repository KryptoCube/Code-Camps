package BRR;

public class RoemischKonverter {
	public static void main(String[] args) {
		int zahl = 2025;
		String roemisch = toRoman(zahl);
		System.out.println(zahl + " = " + roemisch);
	}
	
	public static String toRoman(int zahl) {
		int[] werte = {1000, 900, 500, 400, 100, 90, 50, 40,10 ,9 ,5 , 4, 1};
		String[] zeichen = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		StringBuilder ergebnis = new StringBuilder();
		
		for (int i=0; i < werte.length; i++) {
			while(zahl >= werte[i]) {
				ergebnis.append(zeichen[i]);
				zahl -= werte[i];
			}
		}
		
		return ergebnis.toString();
		
	}

}
