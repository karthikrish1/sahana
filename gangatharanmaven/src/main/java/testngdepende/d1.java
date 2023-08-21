package testngdepende;

import org.testng.annotations.Test;

public class d1 {
	
	//dependsonmethods: create connection btween test cases
	
	@Test(priority=0)
	public void visiting()
	{
		System.out.println("Visiting ");
	}
	
	@Test(priority=1, dependsOnMethods="visiting")
	public void lg()
	{
		System.out.println("login");
	}
	
	//visiting: pass lg: run
	// visiting: fail  lg: skip

}
