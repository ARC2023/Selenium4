package windowshandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();

		String mainWindowId = driver.getWindowHandle();
		Set<String> windowsIDs = driver.getWindowHandles();

		Iterator<String> itr = windowsIDs.iterator();

		while (itr.hasNext()) {
			String childwindow = itr.next();

			if (!mainWindowId.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);

				try {
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("arc@gmail.com");
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				driver.close();
				}catch(NoSuchElementException e) {
					e.printStackTrace();
					driver.close();
				}
				

			}

		}
		//System.out.println("Before switching to main window"); 
		//driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();
		System.out.println("After switching to main window");
		driver.switchTo().window(mainWindowId);
		driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();
	}

}
