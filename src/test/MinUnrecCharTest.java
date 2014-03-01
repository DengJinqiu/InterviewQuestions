package test;

import static org.junit.Assert.*;
import min.unrecognized.characters.MinUnrecChar;

import org.junit.Test;

public class MinUnrecCharTest {

	@Test
	public void test() {
		MinUnrecChar a = new MinUnrecChar();
		a.dic.add("looked");
		a.dic.add("just");
		a.dic.add("like");
		a.dic.add("her");
		a.dic.add("brother");
		
		assertEquals(a.find("jesslookedjustliketimherbrother"), "JESS looked just like TIM her brother");
	}

}