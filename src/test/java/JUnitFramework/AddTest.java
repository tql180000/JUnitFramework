package JUnitFramework;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest
{

	@Test
	public void test()
	{
		ClassA ca = new ClassA();
		
		int result = ca.add(Integer.MAX_VALUE, 1);
		
		assertEquals(Integer.MAX_VALUE + 1, result);
		
		
		
	}

}
