package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		
		// For Windows Machine
		//System.setProperty("webdriver.chrome.driver", "C:/Program Files ...chromedriver.exe");
		// if mac or linux no need to mention file name with exe
		System.setProperty("webdriver.chrome.driver", "/Users/andrewcharles/Documents/SeleniumDriversNaveen/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		// browser 118-->118.exe 
		//4.3.0
		driver.get("https://www.google.com");

	}

}
