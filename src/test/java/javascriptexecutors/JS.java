package javascriptexecutors;

import java.util.Arrays;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JS {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));
		driver = new ChromeDriver(option);
		driver.get("https://www.naukri.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Login']"));

		// colorChange(ele, "rgb(200,20,81)");

		// flashing(ele);

		borderCreation(ele);
	}

	public static void colorChange(WebElement etr, String color) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", etr);

		Thread.sleep(1000);
	}

	public static void flashing(WebElement etr) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String backGroundColor = etr.getCssValue("backgroundColor");
		System.out.println("BackGround Color of Element -->" + backGroundColor);
		for (int i = 0; i < 10; i++) {
			colorChange(etr, "rgb(200,20,81)");
			colorChange(etr, backGroundColor);
		}
	}

	public static void borderCreation(WebElement etr) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='10px solid yellow'", etr);
	}
	
	/***********************************************************************/
	
	public static void generateAlert( String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "');");
	}

	public static void clickOnElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void enterValueInTextBox(WebElement element,String UN) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + UN + "';", element);
	}

	public static void refreshPageJS() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}

	public static void getURL() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("Title of page by one way-->" + js.executeScript("return document.URL;").toString());
		String title = (String) js.executeScript("return document.URL;");
		System.out.println("Title of page by other way-->" + title);
	}

	public static void getTitle() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("URL of page by one way-->" + js.executeScript("return document.title;").toString());
		String title = (String) js.executeScript("return document.title;");
		System.out.println("URL of page by other way-->" + title);
	}

}
