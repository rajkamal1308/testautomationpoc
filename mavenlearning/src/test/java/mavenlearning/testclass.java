package mavenlearning;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
//hello world
public class testclass {

	@Test
	public void sum()
	{
	int a = 10;
	int b = 20;
	System.out.println("Sum");
	AssertJUnit.assertEquals(30, a+b);
	}
	
	@Test
	public void sub()
	{
	int a = 10;
	int b = 20;
	System.out.println("Sub");
	AssertJUnit.assertEquals(10,b-a);
	}
	
}
