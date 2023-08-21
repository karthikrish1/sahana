package testngdepende;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mr {
	ChromeDriver ob;
	@Test(priority=0, description="visiting",groups="L")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ob= new ChromeDriver();
		//visit
		ob.get("http://www.google.com");
	}
	
	@Test(priority=1, description="maximising",groups="L")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2, description="refreshing",invocationCount=3,groups="L")
	public void refresh()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3, description="clicking",dependsOnGroups="L")
	public void clicking()
	{
		ob.findElementByLinkText("Images").click();
	}
	
	@Test(priority=4, description="closing",dependsOnGroups="L",timeOut=4000)
	public void closing() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.quit();
	}

}
