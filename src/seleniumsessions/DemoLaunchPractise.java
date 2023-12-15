package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunchPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");// to open a web page
		
		//driver.findElement(By.cssSelector(".form-control.private-form__control.login-email")).sendKeys("nav@gmail.com");
		// to enter text in textbox after creating web element using CSS SELECTOR
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
		
		

	}

}
