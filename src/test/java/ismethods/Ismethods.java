package ismethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ismethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath("//h2[text()='Dropdown Menu(s)']"));

		System.out.println("Is Displayed -->" + ele.isDisplayed());

		System.out.println(driver.findElement(By.xpath("//input[@value='option-3']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@value='option-4']")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//input[@value='cabbage']")).isEnabled());		
		System.out.println(driver.findElement(By.xpath("//input[@value='pumpkin']")).isEnabled());		

		

	}

}
