package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.SeleniumForEveryonePageObjects;

public class TestSeleniumForEveryonePage {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		testSeleniumForEveryone();
	}

	public static void testSeleniumForEveryone() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		SeleniumForEveryonePageObjects seleniumForEveryonePageObject = new SeleniumForEveryonePageObjects(driver);
		driver.get("http://localhost:8000");
		seleniumForEveryonePageObject.setTextInTextBox("coffee");
		seleniumForEveryonePageObject.clickButton();
		driver.quit();
	}
}
