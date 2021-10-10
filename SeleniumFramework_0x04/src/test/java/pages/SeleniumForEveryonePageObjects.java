package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SeleniumForEveryonePageObjects {
	WebDriver driver = null;
	
	By text_box = By.name("q");
	By button = By.className("button");
	
	public SeleniumForEveryonePageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTextInTextBox(String text) {
		driver.findElement(text_box).sendKeys(text);
	}
	
	public void clickButton() {
		driver.findElement(button).sendKeys(Keys.RETURN);
	}
}
