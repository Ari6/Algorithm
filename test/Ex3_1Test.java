package algorithm.test;

import algorithm.Ex3_1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex3_1Test {

	@Test
	void testEqualEx3_1() {
		assertEquals(4, Ex3_1.seqSearch(new int[] {1,2,3,4,5}, 5, 5));
		
		//fail("Not yet implemented");
	}
	@Test
	void testNotNullEx3_1() {
		assertNotNull(Ex3_1.seqSearch(new int[] {1,2,3,4,5,5}, 5, 10));
	}
}
