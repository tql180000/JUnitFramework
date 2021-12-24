package JUnitFramework;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcateTest
{

	@Test
	public void test()
	{
		ClassA ca = new ClassA();
		String result = ca.concat("abc", "def");
		assertEquals("abcdef", result);
	}

}
