package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TestCompteBancaire {
	@Test
	void testDebiter() {
		CompteBancaire c = new CompteBancaire();
		assertEquals(90,c.debiterSolde(10));
		assertEquals(99.5,c.debiterSolde(0.5));
	}

	@Test
	void testCrediter() {
		CompteBancaire c = new CompteBancaire();
		assertEquals(110,c.crediterSolde(10));
		assertEquals(100.5,c.crediterSolde(0.5));
	}
}
