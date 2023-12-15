package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	
	//SRP
	
	private WebDriver driver;
	
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	

	public By getBy(String locatorType, String locatorValue) {
		By by = null;
		
		switch (locatorType.toLowerCase().trim()) {
		case "id":
			by = By.id(locatorValue);
			break;
		
	
		default:
			break;
		}
		
		return by;
		
	}
	
	
	//locatorType = "id", locatorValue = "input-email", value = "tom@gmail.com"
	public void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(getBy(locatorType, locatorValue)).sendKeys(value);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	//public void doClick(By locator) {
	//	getElement(locator).click();
	//}
	
	//public String doElementGetText(By locator) {
	//	return getElement(locator).getText();
	//}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}


	public List<WebElement>  getElements(By locator) {
		return driver.findElements(locator);
	}
	public  boolean checkSingleElementPresent(By locator) {
		return driver.findElements(locator).size()==1 ? true : false;
	}
	
	public  boolean checkElementPresent(By locator) {
		return driver.findElements(locator).size()>1 ? true : false;
	}


public  void ClickonElement(By locator, String eText) {
	List<WebElement> eleList=getElements(locator);
	System.out.println(eleList.size());
	for (WebElement e : eleList) {
		String text=e.getText();
		System.out.println(text);
		if (text.contains(eText)) {
			e.click();
			break;
		}
		
		
	}
}
}