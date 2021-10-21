package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	public void testSeleniumForEveryone() {
		SeleniumForEveryonePageObjects seleniumForEveryonePageObject = new SeleniumForEveryonePageObjects(driver);
		driver.get("http://localhost:8000");
		seleniumForEveryonePageObject.setTextInTextBox("coffee");
		seleniumForEveryonePageObject.clickButton();
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
}
