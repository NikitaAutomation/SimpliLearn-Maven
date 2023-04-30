package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	////////////////////////////OBJECTS///////////////////
	@FindBy(name="user_login")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(className="rememberMe")
	WebElement Rememberme;
	
	@FindBy(name="btn_login")
	WebElement loginbutton;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//////////// METHODS/////////////////////////
	public void LoginFunction(String uname, String pwd)
	{
		//WebElement username= driver.findElement(By.name("user_login"));
		username.sendKeys(uname);
		
		
		
		//WebElement password= driver.findElement(By.id("password"));
		password.sendKeys(pwd);
		
	//	WebElement Rememberme= driver.findElement(By.className("rememberMe"));
		Rememberme.click();
		
		
	//	WebElement loginbutton= driver.findElement(By.name("btn_login"));
		loginbutton.click();
		
		
		

	}

}
