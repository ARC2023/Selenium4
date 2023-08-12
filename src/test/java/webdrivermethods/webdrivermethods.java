package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class webdrivermethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		
		// Q difference between driver.get and driver.navigate.to?
		// Q In how many ways you can load URL?
		
		driver.get("https://www.saucedemo.com/");
		/*Thread.sleep(3000);
		driver.navigate().to("https://www.saucedemo.com/");
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();*/
		
		
		System.out.println("Current URL : - "+driver.getCurrentUrl());		
		System.out.println("Title URL : - "+driver.getTitle());
		System.out.println("Page Source URL : - "+driver.getPageSource());
		
		/*driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		Thread.sleep(3000);*/
		
//		driver.manage().timeouts();
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@class,'submit-button')]"));
		WebElement passWordText = driver.findElement(By.xpath("//div[text()='secret_sauce']"));
		userName.sendKeys("standard_user");
		Thread.sleep(3000);
		userName.clear();
		Thread.sleep(3000);
		userName.sendKeys("standard_user");
		System.out.println(userName.getCssValue("color"));
		System.out.println(userName.getCssValue("font-size"));		
		System.out.println(userName.getAttribute("id"));
		System.out.println(userName.getTagName());
		String pwt=passWordText.getText();
		System.out.println(pwt);
		String[] str=pwt.split("\\n");
		System.out.println(str[1]);		
		passWord.sendKeys(str[1]);
		loginBtn.click();
		
		
		
		
		
	}

}
