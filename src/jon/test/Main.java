package jon.test;

import static jon.test.PrimeUtil.*;

public class Main {

	public static void printPrimes(int start, int end) {
		
		long startMillis = System.currentTimeMillis();
		
		for (int i = start; i < end; i++) {
			if (isPrimeSmarter(i)) {
				System.out.format("The number %d is prime!%n", i);
			}
		}
		
		long stopMillis = System.currentTimeMillis();
		
		System.out.println("Time: " + (stopMillis - startMillis) + " millisec");
	}
	
	public static void main(String[] args) {
		
//		printPrimes(0, 100);
//		printPrimes(0, 1000);
		printPrimes(100000000, 100001000);
	}

}
