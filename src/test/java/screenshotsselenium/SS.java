package screenshotsselenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		takeScreenShot("Home Page of Naukri");
	}

	public static void takeScreenShot(String fileName) throws IOException {
		
		LocalDateTime timestamp = LocalDateTime.now();
		
		System.out.println(timestamp);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MMM_dd_HH_mm_ss");
		
		String formattedTimestamp = timestamp.format(formatter);
		
		System.out.println(formattedTimestamp);
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		File desFile = new File("C:\\ARC\\Code-WorkSpace\\Selenium4\\ScreenShots\\"
				+ formattedTimestamp + "_" + fileName + ".jpg");
		
		FileUtils.copyFile(srcFile, desFile);
		
		System.out.println("Screen Shot Taken");
	}

}
