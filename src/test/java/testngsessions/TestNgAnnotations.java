package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	@BeforeSuite
	public void connectwithDB() {
		System.out.println("BS- Connect with DB");
	}
	
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT- create user");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC- launch Browser");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM- login to app");
	}
	
	@Test
	public void searchTest() {
		System.out.println("Search Test");
		
	}
	

	@Test
	public void addToCartTest() {
		System.out.println("addToCartTest");
		
	}
	

	@Test
	public void checkoutTest() {
		System.out.println("checkoutTest");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM-- logout");
	}
		
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-- close browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT-- delete user ");
	}
	
	@AfterSuite
	public void disconnectwithDB() {
		System.out.println("AS--disconnect with DB ");
	}
	
	}


	

