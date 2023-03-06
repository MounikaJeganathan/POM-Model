package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.interactions.touch.Up;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.UpdateProfileObjects;

public class UpdateProfileTestCases {
	@Test
	public void updateProfile() {

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
		
		PageFactory.initElements(driver, UpdateProfileObjects.class);
		
		UpdateProfileObjects.myprofile.click();
		UpdateProfileObjects.phone.clear();
		UpdateProfileObjects.phone.sendKeys("1234567890");
		UpdateProfileObjects.city.sendKeys("Kings");
		UpdateProfileObjects.updateButton.click();

		/*
		 * LoginPageObjects.username(driver).sendKeys("");
		 * LoginPageObjects.password(driver).sendKeys("demouser");
		 * LoginPageObjects.submitButton(driver).click();
		 * 
		 * //UpdateProfileObjects profileObjects = new UpdateProfileObjects();
		 * UpdateProfileObjects.myprofile(driver).click();
		 * UpdateProfileObjects.phone(driver).clear();
		 * UpdateProfileObjects.phone(driver).sendKeys("1234567890");
		 * UpdateProfileObjects.city(driver).sendKeys("kings");
		 * UpdateProfileObjects.updateButton(driver).click();
		 */

	}

}
