package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		/*
		 * Q)How to handle dynamic WebTable In Selenium
		 * 
		 * There are two ways of handling WebTable:
		 * */
		
		 /* 
		 * Method � 1: 
		 * � Iterate row and column and get the cell value. 
		 * � Using for loop
		 * � Get total rows and iterate table 
		 * � Put if(string matches) then select the respective check box 
		 * � Lengthy method
		 */
		driver.get("https://www.nseindia.com/market-data/pre-open-market-cm-and-emerge-market");
		
		List<WebElement> ele22 = driver.findElements(By.xpath("//table[@id='livePreTable']//tbody//tr"));

		String str1 = "//table[@id='livePreTable']//tbody//tr[";
		
		String str2 = "]//td[2]//a";

		for (int i = 1; i < ele22.size(); i++) {

			String xpathExp = str1 + i + str2;
			
			//table[@id="livePreTable"]//tbody//tr[1]//td[2]//a	
			
			WebElement rows = driver.findElement(By.xpath(xpathExp));
			
			//table[@id="livePreTable"]//tbody//tr[1]//td[2]//a//parent::td//preceding-sibling::td//button
			String value = rows.getText();

			if (value.equals("TCS")) {
				xpathExp=xpathExp+"//parent::td//preceding-sibling::td//button";
				WebElement rowClick = driver.findElement(By.xpath(xpathExp));
				rowClick.click();
			}

		}

		List<WebElement> column2= driver.findElements(By.xpath("//table[@id='livePreTable']//tbody//tr//td[2]//a"));
		
		for(WebElement ele:column2) {
			int i=1;
			if (ele.getText().equals("TCS")) {	
				String str="//table[@id='livePreTable']//tbody//tr["+i+"]//td[2]//a//parent::td//preceding-sibling::td//button";
				WebElement rowClick = driver.findElement(By.xpath(str));
				rowClick.click();
				break;
			}
			i++;
		}
		
		
		/*
		 * Method � 2: 
		 * � Using custom XPath 
		 * � Using parent and preceding-sibling tags
		 * � No need to write for loop 
		 * � No full iteration of table 
		 * � Single line statement 
		 * � More dynamic 
		 * � Efficient and fast
		 */
		// driver.get("https://www.nseindia.com/market-data/pre-open-market-cm-and-emerge-market");
		
		elementClick("TCS");	
		
	}
	
	
	public static void elementClick(String company) {
		
driver.findElement(By.xpath("//a[text()='"+company+"']//parent::td//preceding-sibling::td//button//span")).click();
	}
	
}
