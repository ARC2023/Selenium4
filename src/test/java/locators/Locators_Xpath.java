package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Xpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

	

		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@class,'submit-button')]"));

		try {
			Thread.sleep(3000);
			userName.sendKeys("standard_user");
			Thread.sleep(3000);
			passWord.sendKeys("secret_sauce");
			Thread.sleep(3000);
			loginBtn.click();
			Thread.sleep(3000);
		} catch (Exception e) {

		}

		
		//1. Operator - And
		
		WebElement andOptr= driver.findElement(By.xpath("//input[@class='input_error form_input' and @name='user-name']"));
		
		//2. Operator - Or
		
		List<WebElement> orOptr= driver.findElements(By.xpath("//input[@class='input_error form_input' or @name='user-name']"));
		
		//3. Contains
		
		WebElement contains = driver.findElement(By.xpath("//input[contains(@class,'submit-button')]"));

		// 4. text 
		
		WebElement text = driver.findElement(By.xpath(""));
		
	}

}
