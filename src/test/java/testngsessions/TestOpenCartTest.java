package testngsessions;

import org.testng.annotations.Test;

public class TestOpenCartTest {

	@Test
	public void loginTest() {
		System.out.println("login to app");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchHomePageTest() {
		System.out.println("searchTest");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods="searchHomePageTest")
	public void addToCartTest() {
		System.out.println("addToCartTest");
		//int i = 9/0;
	}
}
