package examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveCharacterATest {
	
	
	
	RemoveCharacterA removeCharacterA;
	
	@BeforeEach
	void init() {
		removeCharacterA = new RemoveCharacterA();
	}
	
	@Test
	void testAtFirstPosition() {
		assertEquals("BCD",removeCharacterA.remove("ABCD"));
	}
	
	@Test
	void testAtBothPosition() {
		assertEquals("CD",removeCharacterA.remove("AACD"));
	}
	
	@Test
	void testAtSecondPosition() {
		assertEquals("BCD",removeCharacterA.remove("BACD"));
	}
	
	@Test
	void testNoOccurance() {
		assertEquals("BBAA",removeCharacterA.remove("BBAA"));
	}
	
	@Test
	void testMoreOccurances() {
		assertEquals("BAA",removeCharacterA.remove("AABAA"));
	}
	
	@Test
	void testLength2String() {
		assertEquals("",removeCharacterA.remove("AA"));
	}
	
	@Test
	void testLength1String() {
		assertEquals("",removeCharacterA.remove("A"));
	}
	
	@Test
	void testEmptyString() {		
		assertEquals("",removeCharacterA.remove(""));
	}
}