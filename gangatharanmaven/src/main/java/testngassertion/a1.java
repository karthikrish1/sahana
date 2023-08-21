package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class a1 {/*
	 * assertion: technique where we will be comparing actual result with obtained result
	 * * hard asserts
	 *          provided by Assert builtin class
	 *          static in nature
	 *          assertion fails=> fail the test case
	 *          
	 * soft asserts
	 *      provided by SoftAssert builtin class
	 *      nonstatic in nature
	 *      assertion fail=> it ill proceed further
	 *      invoke assert All-> see the original result 
	 * * assertEqual(actual, expected)
	 * assertNotEquals(actual, expected)
	 * assertTrue(condition)
	 * assertFalse(condition)
	 * * */
	@Test
	public void hd()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		//Assert.assertEquals(ob.getTitle(), "Googdfsmflkle");
		Assert.assertNotEquals(ob.getTitle(), "Googdfsmflkle");
		WebElement ele = ob.findElementByLinkText("Gmail");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
		
	}
}
