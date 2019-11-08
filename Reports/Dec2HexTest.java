import static org.junit.Assert.*;
import org.junit.Test;
 
/**
 * This is test case class for Dec2Hex method.
 * 
 */
public class TestCase {
	//Dec2Hex class objects
	Dec2Hex Dec2Hex1 = new Dec2Hex(100); 
	Dec2Hex Dec2Hex2 = new Dec2Hex(98); 
	Dec2Hex Dec2Hex3 = new Dec2Hex(16);
 
	//Test case for division
	@Test
	public void test() {
		assertEquals(64, Dec2Hex1.num);
		assertEquals(62, Dec2Hex1.num);
		assertEquals(10, Dec2Hex1.num);
	}
 
	
}