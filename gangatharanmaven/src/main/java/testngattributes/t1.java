package testngattributes;

import org.testng.annotations.Test;

public class t1 {
	
	//Testng : Test next generation
	// testing framework
	// inspired from JUNIT
	// annotations
	// attributes
	// suite
	// parallel
	
	
	// test case
	// nonstatic
	// @Test
	// default order: alphabetical order 
	
	
	//priority
	//description 
	//group
	//invocationcoutn
	//enabled=false
	//timeout
	
	@Test(priority=0,description="One",groups="G",invocationCount=5,enabled=false)
	public void m1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority=1,description="Two",groups="G")
	public void m2()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=2,description="Three",groups="S")
	public void ab()
	{
		System.out.println("Test case 3");
	}
	

}
