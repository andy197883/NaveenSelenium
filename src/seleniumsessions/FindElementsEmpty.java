package seleniumsessions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElementsEmpty {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
        //int count =driver.findElements(By.xpath("//input[@class='naveen']")).size(); 
        
       // System.out.println(count);
		//driver.findElement(By.xpath("//input[@class='naveen']")).sendKeys("test");
		//NSE
		
		//List <WebElement> eles =driver.findElements(By.xpath("//input[@class='naveen']")); 
		//System.out.println(eles.size());
		
By logo = By.cssSelector(".img-responsive");
		
		if(checkElementPresent(logo)) {
			System.out.println("logo is pass");
		}
		else {
			System.out.println("FAIL");
		}
		
	}
	
	public static boolean checkElementPresent(By locator) {
		return driver.findElements(locator).size()==1 ? true : false;
	}
	
}
