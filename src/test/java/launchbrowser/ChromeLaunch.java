package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		By userName = By.id("user-name");
		By passWord = By.name("password");
		By loginBtn = By.id("login-button");
		
		
		WebElement userNameElement =  driver.findElement(userName);				
		WebElement passWordElement =  driver.findElement(passWord);
		WebElement loginBtnElement =  driver.findElement(loginBtn);
		
		try {
		Thread.sleep(3000);
		userNameElement.sendKeys("standard_user");
		Thread.sleep(3000);
		passWordElement.sendKeys("secret_sauce");
		Thread.sleep(3000);
		loginBtnElement.click();
		Thread.sleep(3000);
		} catch(Exception e) {
			
		}

		
		
		
		
		
	}

}
