package dropdown;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectMethods_DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		WebElement day= driver.findElement(By.id("day"));
		WebElement month= driver.findElement(By.id("month"));
		WebElement year= driver.findElement(By.id("year"));
		
		// 1. Select Methods
		Select daySelect= new Select(day);		
		daySelect.selectByIndex(8);
		Thread.sleep(3000);
		daySelect.selectByValue("29");
		Thread.sleep(3000);		
		daySelect.selectByVisibleText("15");
		
		
		Select monthSelect= new Select(month);		
		monthSelect.selectByIndex(8);
		Thread.sleep(3000);
		monthSelect.selectByValue("3");
		Thread.sleep(3000);		
		monthSelect.selectByVisibleText("Feb");
		
		
		Select yearSelect= new Select(year);		
		yearSelect.selectByIndex(23);
		Thread.sleep(3000);
		yearSelect.selectByValue("1993");
		Thread.sleep(3000);		
		yearSelect.selectByVisibleText("1991");
		

		
		
		
	}

}
