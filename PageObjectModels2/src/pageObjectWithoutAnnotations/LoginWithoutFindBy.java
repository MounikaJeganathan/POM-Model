package pageObjectWithoutAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindBy {
	
	public static WebElement username;
	public static WebElement password;
	public static WebElement submit;
	
	@Test
	public void login() {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\Documents\\Selenium_training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		username.sendKeys("Admin1");
		password.sendKeys("admin");
		
		submit.click();
		System.out.println("Done");

	}

}
