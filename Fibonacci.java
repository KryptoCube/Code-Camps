package BRR;

import java.util.Scanner;
// 0,1,1,2,3,4´5,8,13...
public class Fibonacci {
	public static void fiboiterativ(int n) {
		int a = 0, b = 1;
		System.out.println("Iterativ:");
		for (int i = 0; i < n; i++) {
			int temp = a+b;
			a = b; 
			b = temp;
		}
		System.out.println();
	}
	
	public static int fiborekursiv(int n) {
		if (n <= 1)
			return n;
		return fiborekursiv(n-1) + fiborekursiv(n-2);
		
	}
	
	public static void main(String[] args) {
		
	}
}
