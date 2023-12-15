package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseSessionId {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
			
		String actTitle =driver.getTitle();
		System.out.println("Title is:" +actTitle );

		//driver.quit();
		
		//sid=null
		
		driver.close();
		
        driver=new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
	}

	}


