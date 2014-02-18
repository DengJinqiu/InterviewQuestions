package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import find.max.number.FindMaxNumber;

public class FindMaxNumberTest {

	@Test
	public void test() {
		FindMaxNumber a = new FindMaxNumber();
		
		for (int i = 0; i < 1000; i++) {
			int a1 = (int) ((Math.random()-1)*2*Integer.MAX_VALUE);
			int b1 = (int) ((Math.random()-1)*2*Integer.MAX_VALUE);
		
			assertEquals(a.max(a1, b1), Math.max(a1, b1));
		}

		assertEquals(a.max(Integer.MAX_VALUE, Integer.MIN_VALUE),Integer.MAX_VALUE);
		assertEquals(a.max(Integer.MAX_VALUE, Integer.MAX_VALUE),Integer.MAX_VALUE);
		assertEquals(a.max(Integer.MIN_VALUE, Integer.MIN_VALUE),Integer.MIN_VALUE);
	}

}
