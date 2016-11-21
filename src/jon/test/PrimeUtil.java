package jon.test;

public class PrimeUtil {
	
	/**
	 * Given an integer, return true if the number is prime, or false otherwise.
	 * @param num
	 * @return
	 */
	public static boolean isPrimeDumb(int num) {
		boolean isPrime = true;
		
		if (num == 0 || num == 1) {
			return false;
		}
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
	
	/**
	 * Given an integer, return true if the number is prime, or false otherwise.
	 * @param num
	 * @return
	 */
	public static boolean isPrimeSmarter(int num) {
		boolean isPrime = true;
		
		if (num == 0 || num == 1) {
			return false;
		}
		
		for (int i = 2; i <= Math.floor(Math.sqrt(num)); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}

}
