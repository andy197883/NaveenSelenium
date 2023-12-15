package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		 driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		By LangLinks=By.xpath("//div[@id='SIvCob']/a");
		//ClickonElement(LangLinks, "తెలుగు");
		
	}


}
