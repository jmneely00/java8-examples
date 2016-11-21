package jon.test;

import static jon.test.PrimeUtil.*;

import java.util.stream.IntStream;

public class StreamsMain {

	public static void printPrimes(int start, int end) {

		long startMillis = System.currentTimeMillis();
		
		IntStream.range(start, end)
				 .filter(n -> isPrimeSmarter(n))
				 .forEach(System.out::println);
		
		long stopMillis = System.currentTimeMillis();
		System.out.println("Time: " + (stopMillis - startMillis) + " millisec");
	}

	public static void main(String[] args) {

//		 printPrimes(0, 100);
//		 printPrimes(0, 1000);
		printPrimes(100000000, 100001000);
	}

}
