package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertshandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		Alert al= driver.switchTo().alert();
		
		// 1. Get Text
		System.out.println(al.getText());
		// 2. Accept
		al.accept();
		Thread.sleep(3000);
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(3000);
		// 3. Dismiss
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		al.dismiss();
		// 4. Send Keys
		al.sendKeys("");
		// 5. Upload Document
		
		driver.get("https://html.com/input-type-file/");		
		WebElement ele=driver.findElement(By.id("fileupload"));
		ele.sendKeys("C:\\Users\\glend\\OneDrive\\documents\\zoom\\2023-08-19 08.23.18 testing - 5 - july\\video1019113493.mp4");
		*/
		// 6. Auth Factor
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
	}

}
