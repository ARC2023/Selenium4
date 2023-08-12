package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_Xpath {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\glend\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
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

		// 1. Operator - And

		WebElement andOptr = driver
				.findElement(By.xpath("//input[@class='input_error form_input' and @name='user-name']"));

		// 2. Operator - Or

		List<WebElement> orOptr = driver
				.findElements(By.xpath("//input[@class='input_error form_input' or @name='user-name']"));

		// 3. Functions - Contains

		WebElement contains = driver.findElement(By.xpath("//input[contains(@class,'submit-button')]"));

		// 4. Functions - text

		WebElement text = driver.findElement(By.xpath("//a[text()='Register']"));

		// 5. function inside a function ( text inside contains)
		WebElement textContains = driver.findElement(By.xpath("//a[contains(text(),'Regi')]"));

		// 6. Functions - starts-with
		WebElement startsWith = driver.findElement(By.xpath("//a[starts-with(text(),'BAJAJ')]"));

		// 7. X-path Axes

		// 7.1 Following
		// table[@id="livePreTable"]//following::span[@class="columnheader-uppercase"]
		// 7.2 Preceding
		//table[@id="livePreTable"]//preceding::span[@id='betaVderBandText']
		// 7.3 Following - Sibling
		//a[text()='TCS']/..//following-sibling::td
		// 7.4 Preceding - Sibling
		//a[text()='TCS']/..//preceding-sibling::td
		// 7.5 Parent
		//a[text()='TCS']//parent::td
		// 7.7 Child
		//table[@id="livePreTable"]//tbody/tr//child::td
		// 7.8 Ancestor
		//table[@id="livePreTable"]//ancestor::div
		// 7.9 descendant
		//table[@id="livePreTable"]//tbody/tr[9]//descendant::td		
		// 8 Indexing
		//(//input[contains(@class,"input_error form_input")])[1]
		
		
		
	}

}
