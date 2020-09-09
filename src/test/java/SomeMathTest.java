import org.junit.Assert;
import org.junit.Test;

public class SomeMathTest {

	@Test
	public void testMethodA() {
		SomeMath someMath = new SomeMath();
		int result = someMath.methodA(1, 2);
		Assert.assertEquals(result, 3);
	}
}
