package junit.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	
	Junit junit;
	
	@BeforeClass
	public static void setUp(){
		
	}
	
	@Test
	public void addTest(){
		int actual = junit.add();
		assertNotNull(junit.num1);
		assertNotNull(junit.num2);
		int expected = 5;
		assertEquals(expected, 5);
	}
	
	@Test
	public void mulTest(){
		int actual = junit.mul();
		int expected = 6;
		assertEquals(expected, actual);
	}

}
