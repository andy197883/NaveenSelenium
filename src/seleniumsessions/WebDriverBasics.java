package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		//ChromeDriver driver= new ChromeDriver();
		//FirefoxDriver driver= new FirefoxDriver();
		//EdgeDriver driver= new EdgeDriver();
		
		String browser="opera";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome" :
			driver= new ChromeDriver();
			break;
		case "firefox" :
			driver= new FirefoxDriver();
			break;
		case "edge" :
			driver= new EdgeDriver();
			break;
		case "safari" :
			driver= new SafariDriver();
			break;
			default:
				System.out.println("Please pass the right browser");
				break;
		}
		
		
		//WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		
		
		String actTitle =driver.getTitle();
		System.out.println("Title is:" +actTitle );

		if (actTitle.equals("Google")) {
			System.out.println("title is correct -- PASS");
		}
		else {
			System.out.println("title is not correct -- FAIL");
		}
		
		driver.quit();
	}

}
