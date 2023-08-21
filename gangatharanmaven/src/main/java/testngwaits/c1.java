package testngwaits;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class c1 {
/*Testngwaits/webdriver synchronisation
	 * conditional       : explicit wait 
	 * unconditional     : implciit wait, thread.sleep()
	 * * implciit wait: once it is declared all the code which is present after it will take the time limit
	 * * code is correct: executes within time limit. wont wait for the completion of time limit
	 * code is wrong: wait for the completion of time limit, then it throws up error * 
	 * */
	@Test
	public void hdy()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		ob.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		System.out.println(ob.getTitle());//6
		System.out.println(ob.getCurrentUrl());//6
		ob.navigate().refresh();//6
		ob.findElementByLinkText("pm"); //6
		ob.close();//6
	}
}
