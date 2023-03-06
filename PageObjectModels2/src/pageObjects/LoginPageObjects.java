package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	@FindBy(how = How.NAME,using = "email")
	public static WebElement username;
	
	@FindBy(name ="password")
	public static WebElement password ;
	
	@FindBy(xpath = "//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement submitButton ;

	/*  public static WebElement username(WebDriver driver) { 
		  return driver.findElement(By.name("email"));
	 
	  }
	  
	  public static WebElement password(WebDriver driver) {
		  return driver.findElement(By.name("password"));
	  
	  }
	  
	  public static WebElement submitButton(WebDriver driver) {
		  return driver
			.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
	  
	  }*/
	 

}
