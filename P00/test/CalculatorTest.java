import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		// fail("Not yet implemented");
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
		// fail("Not yet implemented");
		int a = 9876;
		int b = 4321;

		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiple() {
		// fail("Not yet implemented");
		int a = 12;
		int b = 34;

		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);

		int expected = 408;
		assertEquals(expected, actual);
	}

	@Test
	public void testDivided() {
		// fail("Not yet implemented");
		int a = 200;
		int b = 5;

		Calculator cal = new Calculator();
		int actual = cal.divided(a, b);

		int expected = 40;
		assertEquals(expected, actual);
	}

}

