package calendar;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CH {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		driver.findElement(By.id("first_date_picker")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		selectDate("26","December","2022");
		
		
	}

	public static void selectDate(String date, String month, String year) throws Exception {
		int dateInput = Integer.parseInt(date);
		int yearInput = Integer.parseInt(year);

		if (dateInput > 31) {
			throw new Exception("Dates cannot be greater than 31");
		}
		if (month.equals("February") && dateInput > 29) {
			throw new Exception("For February the date is should be less than 29 or 29 if its a leap year");
		}

		String monthyear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println("Month and Year from Calendar UI-->" + monthyear);

		String[] spliiter = monthyear.split(" ");
		System.out.println("Month from Calendar UI-->" + spliiter[0]);
		System.out.println("Year from Calendar UI-->" + spliiter[1]);
		String monthFromScreen = spliiter[0];
		int currentYearFromScreen = Integer.parseInt(spliiter[1]);
		String curentYearFSString = spliiter[1];

		//    December = December                                         2024 = 2024

		while (!(month.equals(monthFromScreen) && year.equals(curentYearFSString))) {

			if (yearInput > currentYearFromScreen) {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			else if(yearInput<currentYearFromScreen) {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
				
			}else if(yearInput==currentYearFromScreen) {
				
				
				
								
			}
			
			
			monthyear = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println("Month and Year from Calendar UI-->" + monthyear);
			spliiter = monthyear.split(" ");
			System.out.println("Month from Calendar UI-->" + spliiter[0]);
			System.out.println("Year from Calendar UI-->" + spliiter[1]);
			monthFromScreen = spliiter[0];
			curentYearFSString = spliiter[1];

		}
		try {

			WebElement ele = driver.findElement(By.xpath("//a[text()='" + date + "']"));
			new Actions(driver).scrollToElement(ele);
			clickOnElement(ele);

		} catch (Exception e) {

		}

	}

	public static void clickOnElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

}
