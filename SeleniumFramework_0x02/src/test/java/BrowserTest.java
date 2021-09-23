import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers/chromedriver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", projectPath+"//drivers/geckodriver/geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:8000");
		
		WebElement textBox = driver.findElement(By.name("q"));
		
		textBox.sendKeys("coffee");
		
		WebElement searchBtn = driver.findElement(By.className("button"));
		
		searchBtn.click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
