package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{

	
	
	
	



	@Test(priority = 1)
	public void amazonTitleTest() {
		driver.get("https://amazon.com");
		String actutalTitle = driver.getTitle();
		System.out.println(actutalTitle);
		Assert.assertTrue(actutalTitle.contains("amazon"));
	}
	

	@Test(priority = 2)
	public void amazonitleTesttURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("amazon"));
	}



	
}
