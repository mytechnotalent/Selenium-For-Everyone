package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SeleniumForEveryonePageObjects;

public class TestSeleniumForEveryonePage {
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testSeleniumForEveryoneTitle() {
		String expectedTitle;
		String actualTitle;
		driver.get("http://localhost:8000");
		expectedTitle = "SFE";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void testSeleniumForEveryoneSearchPageTitle() {
		String expectedTitle;
		String actualTitle;
		SeleniumForEveryonePageObjects seleniumForEveryonePageObject = new SeleniumForEveryonePageObjects(driver);
		driver.get("http://localhost:8000");
		seleniumForEveryonePageObject.setTextInTextBox("coffee");
		seleniumForEveryonePageObject.clickButton();
		for(String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle);
		}
		expectedTitle = "coffee site:google.com - Google Search";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
}
