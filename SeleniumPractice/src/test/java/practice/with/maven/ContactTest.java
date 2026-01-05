package practice.with.maven;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createContactTest() {
		
		String URL = System.getProperty("url");

		String BROWSER = System.getProperty("browser");

		String USERNAME = System.getProperty("username");

		String PASSWORD = System.getProperty("password");
		
		System.out.println("Execute CreateOrgTest");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("Execute ModifyContactTest");
	}
	

}
