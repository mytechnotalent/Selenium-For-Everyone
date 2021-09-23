import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers/chromedriver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", projectPath+"//drivers/geckodriver/geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		Thread.sleep(3000);
		driver.close();
	}
}
