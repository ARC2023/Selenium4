package action;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseMovements {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		// options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));
		// options.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(options);

		Actions mouse = new Actions(driver);
		/*
		 * driver.get("https://www.nseindia.com/"); WebElement mte=
		 * driver.findElement(By.xpath("//a[text()='Market Data']")); WebElement
		 * clicker=driver.findElement(By.id("Derivatives")); WebElement
		 * Currencyclicker=driver.findElement(By.id("currency-derivatives"));
		 * 
		 * // 1. Move To Element / Hover
		 * 
		 * //mouse.moveToElement(mte).build().perform();
		 * 
		 * // 2. Click using action class
		 * 
		 * mouse.click(clicker).build().perform();
		 * mouse.click(Currencyclicker).build().perform();
		 * 
		 * 
		 * // 3. Drag and Drop traditional way
		 * driver.get("https://jqueryui.com/droppable/");
		 * driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 * Thread.sleep(5000); WebElement drag =
		 * driver.findElement(By.xpath("//div[@id='draggable']//p")); WebElement drop =
		 * driver.findElement(By.xpath("//p[text()='Drop here']"));
		 * 
		 * mouse. clickAndHold(drag). moveToElement(drop). release().build().perform();
		 * 
		 * // 4. Drag and Drop new Way
		 * 
		 * mouse.dragAndDrop(drag, drop).build().perform();
		 * 
		 * // 5. Right Click
		 * 
		 * driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		 * 
		 * WebElement rightClick =
		 * driver.findElement(By.xpath("//span[text()='right click me']"));
		 * Thread.sleep(2000); mouse.contextClick(rightClick).build().perform();
		 
		// 6. Double Click

		driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		mouse.doubleClick(driver.findElement(By.xpath("//h2[text()='Radio Button(s)']"))).build().perform();
*/
		// 7. Send Keys
		driver.get("https://www.facebook.com/");
		WebElement txtUsername = driver.findElement(By.id("email"));

		mouse.sendKeys(txtUsername, "Donald TRUMP").build().perform();
		//mouse.sendKeys(txtUsername,Keys.ENTER).build().perform();

		
		// 8. Scroll to element
		mouse.scrollToElement(driver.findElement(By.xpath("//a[text()='Contact uploading and non-users']"))).build().perform();

		
		// 9. Composite Action
		
		
		
	}

}
