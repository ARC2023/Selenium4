package chromeoptions;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsLive {
	static WebDriver driver;

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		//options.setHeadless(true);
		//options.addArguments("headless");
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking", "enable-automation"));
		//options.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(options);
        driver.get("https://www.google.co.in/");
		for(int i=0;i<90;i++) {
		System.out.println("Loop"+i);
		}
	}

}
