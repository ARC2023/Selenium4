package frames;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesHandling {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		/*
		//driver.switchTo().frame("a077aa5e");	
		WebElement ele= driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(ele);		
		driver.findElement(By.xpath("/html/body/a/img")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();*/
		
		
		List<WebElement> elements=driver.findElements(By.tagName("iframe"));
		System.out.println(elements);
		
		for(WebElement elt: elements) {
			
			
			try {
				driver.switchTo().frame(elt);
			int sizer=driver.findElements(By.xpath("/html/body/a/img")).size();
			System.out.println(sizer);
			if(sizer==1) {
				driver.findElement(By.xpath("/html/body/a/img")).click();
				break;
			}else {
				System.out.println("Better luck next ttime");
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			driver.switchTo().defaultContent();
		}
		
		/*for(int i=0;i<elements.size();i++) {
			
			driver.switchTo().frame(0);
			
		}*/

	}

}
