package testcases;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LogintestCases {
	
	
	@Test
	public void login () {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\Documents\\Selenium_training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://phptravels.net/login");
		
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.username.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.submitButton.click();
		
		/*LoginPageObjects.username(driver).sendKeys("user@phptravels.com");
		LoginPageObjects.password(driver).sendKeys("demouser");
		LoginPageObjects.submitButton(driver).click();
		*/
		
		
		/*WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("user@phptravels.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement loginButton = driver
				.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
		loginButton.click();
		
		WebElement myprofile = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[4]/a"));
		myprofile.click();
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.clear();
		phone.sendKeys("1234567890");
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Kings Landing");
		
		WebElement updateProfile = driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"));
		Actions action = new Actions(driver);
		//action.clickAndHold(updateProfile);
		action.doubleClick(updateProfile);
		*/
		
		
		
		
		
	}

}
