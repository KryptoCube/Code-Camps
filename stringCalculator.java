package BRR;

public class stringCalculator {
	public static int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}
		
		String[] parts = numbers.split(",");
		int sum = 0;
		for (String p: parts) {
			sum += Integer.parseInt(p);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(add(""));
		System.out.println(add("1,2,3,4"));
		
	}
	
}
