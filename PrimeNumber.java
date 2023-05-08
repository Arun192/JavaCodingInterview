package in.arun;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
		int input = sc.nextInt();
		
		boolean prime = isPrime(input);
		
		if (prime) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}
		
	}
	
	static boolean isPrime(int input) {
		
		if (input <2) {
			return false;
		}
		for (int i = 2; i < input; i++) {
			if (input%i==0) {
				
				return false;
			}
		}
		
		
		return true;
		
	}
}
