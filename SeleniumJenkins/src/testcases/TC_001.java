package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {

	@Test
	public void testcase(){
		System.setProperty("webdriver.chrome.driver","D://Harika//workspace//libs//drivers//chromedriver_win32-latest version//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
	}
}
