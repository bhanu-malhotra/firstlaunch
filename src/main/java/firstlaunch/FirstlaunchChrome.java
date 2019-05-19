package firstlaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstlaunchChrome {

	@Test(retryAnalyzer=Retry.class)
	public void launch()
	{
		/*System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// chainign of fn
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		driver.navigate().to(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(52, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(52, TimeUnit.SECONDS);*/
		
		Assert.assertEquals(true, false);
		System.out.println("Test is failing");
	
	}
	@Test
	public void test()
	{
		System.out.println("test case no 2 ");
	}

	
}
