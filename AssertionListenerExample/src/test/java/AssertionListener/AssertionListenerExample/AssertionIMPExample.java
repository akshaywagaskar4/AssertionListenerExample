package AssertionListener.AssertionListenerExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionIMPExample {
	//
	//Velocity
	@Test
	public void test1() {
		String actual="abc";
		String expect="ABC";
		Assert.assertEquals(actual, expect); 		//first=actual  & second=expected
	}
	@Test
	public void test2() {
		int expected=123;
		int actual=321;
		Assert.assertEquals(actual, expected,"Given info is not matching Please check with dev");
	}
	@Test
	public void test3() {
		Assert.assertEquals(200,202,"Info is not matching");
	}
	@Test
	public void test4() {
		System.out.println("Test 4 is started");
		Assert.assertNotEquals(13, 12,"Drop Down is not matched");		//Pass
		//Assert.assertNotEquals(12,12,"Drop down is not matched");		//fail
	}
	@Test
	public void test5() {
		System.out.println("Test case 5 start");
		Assert.assertNotEquals('a','A');							//pass
		//Assert.assertNotEquals('B', 'B',"Character are matched");	//fail
	}

}
