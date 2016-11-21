package jon.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeUtilTest {

	@Test
	public void testisPrime_0() {
		assertFalse(PrimeUtil.isPrimeDumb(0));
		assertFalse(PrimeUtil.isPrimeSmarter(0));
	}
	
	@Test
	public void testisPrime_1() {
		assertFalse(PrimeUtil.isPrimeDumb(1));
		assertFalse(PrimeUtil.isPrimeSmarter(1));
	}

	@Test
	public void testisPrime_3() {
		assertTrue(PrimeUtil.isPrimeDumb(3));
		assertTrue(PrimeUtil.isPrimeSmarter(3));
	}
	
	@Test
	public void testisPrime_4() {
		assertFalse(PrimeUtil.isPrimeDumb(4));
		assertFalse(PrimeUtil.isPrimeSmarter(4));
	}
	
	@Test
	public void testisPrime_11() {
		assertTrue(PrimeUtil.isPrimeDumb(11));
		assertTrue(PrimeUtil.isPrimeSmarter(11));
	}
}
