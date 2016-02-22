package cse360assign3;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}
	
	@After
	public void cleanUpStreams() {
		System.setOut(null);
		System.setErr(null);
	}
	
	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		
		assertNotNull(calc);
	}
	
	@Test
	public void testTotal() {
		Calculator calc = new Calculator();
		
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		
		calc.add(10);
		
		assertEquals(10, calc.getTotal());
	}
	
	@Test 
	public void testSubtraction() {
		Calculator calc = new Calculator();
		
		calc.subtract(2);
		
		assertEquals(-2, calc.getTotal());
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		
		calc.add(2);
		calc.multiply(5);
		
		assertEquals(10, calc.getTotal());
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		
		calc.add(10);
		calc.divide(3);
		
		assertEquals(3, calc.getTotal());
	}
	
	@Test 
	public void testHistory() {
		fail("Not yet implemented");
	}
}
