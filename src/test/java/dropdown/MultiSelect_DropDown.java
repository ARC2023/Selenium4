package dropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		WebElement ele=driver.findElement(By.xpath("//select[@name='Month']"));
		
		
		Select months=new Select(ele);
		
		System.out.println(months.isMultiple());
		
		months.selectByIndex(6);
		months.selectByValue("Aug");
		months.selectByVisibleText("May");
		
		System.out.println();
		for(WebElement elementer:months.getAllSelectedOptions()) {
			System.out.println(elementer.getText());
		}
		
		System.out.println(months.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		months.deselectAll();
		Thread.sleep(3000);
		
		months.selectByIndex(6);
		months.selectByValue("Aug");
		months.selectByVisibleText("May");
		Thread.sleep(3000);
		months.deselectByIndex(6);
		Thread.sleep(2000);
		months.deselectByValue("Aug");
		Thread.sleep(2000);
		months.deselectByVisibleText("May");
		

	}

}
