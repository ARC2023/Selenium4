package javascriptexecutors;

import java.util.Arrays;
import java.util.List;

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

		// driver.navigate().refresh();
		// driver.getTitle();
		// driver.getCurrentUrl();
//		driver.getPageSource();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Login']"));
		// ele.click();
		// ele.sendKeys(args);

		// colorChange(ele, "rgb(200,20,81)");

		// flashing(ele);

		// borderCreation(ele);

		// generateAlert("ALert Testing");

		/*clickOnElement(ele); // alternative to .click()
		WebElement email = driver.findElement(By.xpath("//label[text()='Email ID / Username']/..//input"));
		enterValueInTextBox(email, "arc@gmail.com"); // alternative to .sendkeys()
		retrieveValueOfElement(email);
		Thread.sleep(3000);
		//refreshPageJS();
		
		getURL();
		getTitle();
		retriveInnerTextOfPage();
		
		getElementInnerText(ele);
		
		modifyElement(ele, "Sign In");
		
		getElementInnerText(ele);
		
		
		hideElement(ele);
		Thread.sleep(3000);
		scrollToHeight();
		System.out.println("Scrolled to height");*/
		
		Thread.sleep(3000);
		scrollToElement(driver.findElement(By.xpath("//a[text()='View all companies']")));
		System.out.println("Scrolled to element");
	}

	public static void colorChange(WebElement etr, String color) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", etr);

		Thread.sleep(1000);
	}

	public static void flashing(WebElement etr) throws InterruptedException {
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

	public static void generateAlert(String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "');");
	}

	public static void clickOnElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void enterValueInTextBox(WebElement element, String UN) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + UN + "';", element);
	}

	public static String retrieveValueOfElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String value = js.executeScript("return arguments[0].value;", element).toString();
		System.out.println("Value from Element-->" + value);
		return value;
	}

	public static void refreshPageJS() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}

	public static void getURL() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("Title of page by toString->" + js.executeScript("return document.URL;").toString());
		String title = (String) js.executeScript("return document.URL;");
		System.out.println("Title of page by Casting-->" + title);
	}

	public static void getTitle() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("URL of page by toString-->" + js.executeScript("return document.title;").toString());
		String title = (String) js.executeScript("return document.title;");
		System.out.println("URL of page by Casting-->" + title);
	}
	
	public static void retriveInnerTextOfPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("Inner Text of page by to string-->"
				+ js.executeScript("return document.documentElement.innerText;").toString());
		String title = (String) js.executeScript("return document.documentElement.innerText;");
		System.out.println("Inner Text of page bycasting-->" + title);
	}
		
	public static void modifyElement(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].innerText = '" + value + "';", element);
	}
	public static void getElementInnerText(WebElement element) {
		String innerText = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].textContent;", element);
		System.out.println("Inner Text of Element -->"+innerText);
	}
	

	public static void hideElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.display='none';", element);
		System.out.println("Mission Done");
	}
	
	public static void hideElement(List<WebElement> element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		for(WebElement ele:element) {
		js.executeScript("arguments[0].style.display='none';", ele);
		System.out.println("Mission Done");
		}
	}

	
	public static void scrollToHeight() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	
}
