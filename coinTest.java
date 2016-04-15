import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class coinTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGreedyCoin() {
		int expected = 3;
		int result = coinChange.greedyCoin(45);
		
		Assert.assertEquals(expected, result);
	}

	@Test
	public final void testDynamicCoin() {
		int expected = 3;
		int result = coinChange.dynamicCoin(45);
		
		Assert.assertEquals(expected, result);
	}

}
