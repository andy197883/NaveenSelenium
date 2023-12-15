package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics1 {
	static WebDriver driver;
	public static void main(String[] args) {
		
		//1.Open the browser
		//2.enter url
		//3.get the title
		//4.verify the title:act vs Exp
		//5. close the browser
		
	//ChromeDriver driver=new ChromeDriver();
	
		
	String browser="chrome";
			switch (browser.toLowerCase().trim()) {
			
			case "chrome":
			driver =new ChromeDriver();
			break;
			
			case "edge":
			driver =new EdgeDriver();
			break;
			
			case "firefox":
			driver =new FirefoxDriver();
			break;
			
			case "safari":
			driver =new ChromeDriver();
			break;
			
			default:
				System.out.println("Please pass the correct browser..");
				break;
			
			}
	
	driver.get("http://www.google.com");
	
	String actTitle=driver.getTitle();
	
	System.out.println(actTitle);
	
	if (actTitle.equals("Google")){
		System.out.println(" Title is correct--- PASS");
	}
	else {
		System.out.println(" Title is incorrect--- FAIL");
	}
	
	//driver.getCurrentUrl()	 
	
	//driver.quit();

	}

}
