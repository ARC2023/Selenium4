package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_DropDown {

	public static void selectValueFromDropDown(List<WebElement> elements, String value) {
		for (WebElement ele : elements) {

			if (ele.getText().equals(value)) {
				ele.click();
				break;
			}

		}

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		// 1. Using Get Options
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

		Select daySelect = new Select(day);
		List<WebElement> daysList = daySelect.getOptions();

		for (WebElement ele : daysList) {

			if (ele.getText().equals("9")) {
				ele.click();
			}

		}
		Thread.sleep(3000);
		// 2. Using List to iterate and select from drop down
		List<WebElement> days = driver.findElements(By.xpath("//select[@id='day']//option"));
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']//option"));
		List<WebElement> years = driver.findElements(By.xpath("//select[@id='year']//option"));

		String dob="11-Feb-1996";
		
		String[] dobArray=dob.split("-");
		
		selectValueFromDropDown(days, dobArray[0]);
		selectValueFromDropDown(months, dobArray[1]);
		selectValueFromDropDown(years, dobArray[2]);
		
		

	}

}
