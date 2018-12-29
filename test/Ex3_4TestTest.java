package algorithm.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import algorithm.Ex3_4;

class Ex3_4TestTest {

	@Test
	void testFirstElemEx3_4() {
		int[] a = new int[] {1,2,3,4,5,6,7,8};
		assertEquals(0, Ex3_4.binSearch(a,1));
	}
	
	@Test
	void testLastElemEx3_4() {
		int[] a = new int[] {1,2,3,4,5,6,7,8};
		assertEquals(7, Ex3_4.binSearch(a,8));
	}
	
	@Test
	void testCenter1ElemEx3_4() {
		int[] a = new int[] {1,2,3,4,5,6,7,8};
		assertEquals(3, Ex3_4.binSearch(a,4));
	}
	
	@Test
	void testCenter2ElemEx3_4() {
		int[] a = new int[] {1,2,3,4,5,6,7,8};
		assertEquals(4, Ex3_4.binSearch(a,5));
	}
	
	@Test
	void testNotMatchEx3_4() {
		int[] a = new int[] {1,2,3,4,5,6,7,8};
		assertEquals(-1, Ex3_4.binSearch(a,9));
	}
	
	@Test
	void testFirstNotMatchElemEx3_4() {
		int[] a = new int[] {1,2,3,4,5,6,7,8};
		assertEquals(-1, Ex3_4.binSearch(a,-3));
	}
}
