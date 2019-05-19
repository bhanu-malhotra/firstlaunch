package firstlaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PracticeLocator {

	@Test
	public void Locators() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.istqb.org/downloads/syllabi/foundation-level-syllabus.html");
		d.manage().window().maximize();
		/*
		 * d.findElement(By.id("mod-search-searchword")).sendKeys("Agile");
		 * d.findElement(By.id("mod-search-searchword")).sendKeys(Keys.ENTER);// to
		 * press enter keys
		 */
		// d.findElement(By.name("searchword")).sendKeys("Agile");
		// d.findElement(By.linkText("https://www.istqb.org/downloads/send/51-ctfl2018/208-ctfl-2018-syllabus.html")).click();
		System.out.println(d.findElements(By.tagName("a")).size());
		List<WebElement> list = d.findElements(By.tagName("a"));
		Actions act =new Actions(d);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getText());
//			if(list.get(i).getText().equals("The Foundation Level Syllabus 2018 can be downloaded here."))
//			{
//				act.click(list.get(i)).build().perform();;
//				
//			}
//		}
		d.findElement(By.linkText("The Foundation Level Syllabus 2018 can be downloaded here.")).click();
		}

	}

