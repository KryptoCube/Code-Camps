package BRR;

public class Wordcounterfr {
	public static void main(String[] args) {
		String one = "Guten tag die Herren sküür";
		String[] Array = one.trim().split("\\s+");
		int counter = Array.length;
		
		System.out.println("Counter = " + counter);
 	}

}
