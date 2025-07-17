package coco;
import org.junit.Test;
import jcoco.calculator;
import static org.junit.Assert.*;
public class CalculatorTest {
	@Test
	public void testAdd() {
		calculator c =new calculator();
		assertEquals(5, c.add(2,  3));
	}
	@Test
	public void testSubtract() {
		calculator c =new calculator();
			assertEquals(1, c.subtract(3,  2));
	}

}
