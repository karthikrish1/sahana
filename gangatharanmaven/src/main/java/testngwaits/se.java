package testngwaits;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class se {
	
	 /* explicit wait: conditional synchronisation
	  * create an object for webdriverwait
	  * pass driver instance and time limit as input
	  * call untill method
	  * call conditions
	  * * code is correct: executes within time limit. wont wait for the completion of time limit
	 * code is wrong: wait for the completion of time limit, then it throws up error * * 
	  * */
		@Test
		public void hdy()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
			ChromeDriver ob= new ChromeDriver();
			ob.get("http://www.google.com");
			WebDriverWait w= new WebDriverWait(ob,5);
			//title
			//w.until(ExpectedConditions.titleIs("Googsdsdle"));
			//w.until(ExpectedConditions.titleContains("oo"));
			
			//alert is present
			//w.until(ExpectedConditions.alertIsPresent());
			
			//element: visibility
			//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
			
			// more elements
			//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
			
			//element is clickable
			w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
			ob.close();
		}

}
