import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//D:\Selenium_Class\Selenium_WorkSpace\JenkinMaven
public class UITest {

	@Test
	public void test1() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
