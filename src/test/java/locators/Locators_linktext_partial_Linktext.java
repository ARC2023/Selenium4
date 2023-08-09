package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_linktext_partial_Linktext {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(3000);
		//By  fullText= By.linkText("Create your Amazon account");
		By  partialText= By.partialLinkText("Create your");
		
		
		//WebElement fullTextElement = driver.findElement(fullText);
		WebElement partialTextElement = driver.findElement(partialText);
		Thread.sleep(3000);
		
		//System.out.println(fullTextElement.getText());
		//fullTextElement.click();
		System.out.println(partialTextElement.getText());
		partialTextElement.click();
	}

}
