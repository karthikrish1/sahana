package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {
	
	//before test: run only once before all the test cases stated its execution
	//after test : run only once after all the test cases finished its execution
	
	//before class:run only once after before test 
	//after classL run only once before after test 
	
	//before method:  run before each test case
	// after method: run after each test case
	
	// before test:visiting
	//    before class : max
	//             before method: refresh   tc1: getting title   after method: deleting cookies
	//             before method: refresh   tc2: clicking        after method: deleting cookies
	//    after classS: get size
	//after test : closing
	ChromeDriver ob;
	
	@Test
	public void t1()
	{
		System.out.println("Test case 1" + ob.getTitle());
	}
	
	@Test
	public void t2()
	{
		System.out.println("Test case 2");
		ob.findElementByLinkText("Privacy").click();
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("before test: visiting website ");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ob= new ChromeDriver();
		//visit
		ob.get("http://www.google.com");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("after test");
		ob.quit();
	}
	
	
	
	@BeforeClass
	public void bct()
	{
		System.out.println("before class ");
		ob.manage().window().maximize();
	}
	
	@AfterClass
	public void act()
	{
		System.out.println("after class");
		System.out.println(ob.manage().window().getSize());
	}
	
	
	@BeforeMethod
	public void btm()
	{
		System.out.println("beforemethod ");
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void atm()
	{
		System.out.println("after method");
		ob.manage().deleteAllCookies();
	}
	
	

}
