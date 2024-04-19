package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TestCompteBancaire {
	@Test
	void testDebiter1() {
		CompteBancaire c = new CompteBancaire(100);
		assertEquals(99.5,c.debiterSolde(0.5));
	}
	
	@Test
	void testDebiter2() {
		CompteBancaire c = new CompteBancaire(100);
		assertEquals(90,c.debiterSolde(10));
	}

	@Test
	void testCrediter1() {
		CompteBancaire c = new CompteBancaire(100);
		assertEquals(110,c.crediterSolde(10));
	}
	
	@Test
	void testCrediter2() {
		CompteBancaire c = new CompteBancaire(100);
		assertEquals(100.5,c.crediterSolde(0.5));
	}
}
