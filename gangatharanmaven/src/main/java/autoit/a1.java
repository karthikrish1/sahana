package autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class a1 {
	
	@Test
	public void t1() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.monsterindia.com/seeker/registration"); //Testing webpage
		Thread.sleep(3000);
		d.findElementByCssSelector("#basicDetails > div.padding-15 > div:nth-child(4) > div.uploadResumeCont > div").click();
		Runtime.getRuntime().exec("D:\\indra.exe");
	}

}
