package aPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheDemoSiteTest {
	
	private WebDriver webDriver;
	String web = "http://www.TheDemoSite.co.uk";
	String userName = "user";
	String userPass = "user";

	@Before
	public void Before() {
		webDriver = new ChromeDriver();
	}

	@Test
	public void Test() {
		
		webDriver.manage().window().maximize(); //maximises page so all options can be seen
		webDriver.navigate().to(web); //opens the web site 
		
		//Add user
		addUser();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//login with added user
		userLogin();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@After
	public void After() {
		webDriver.quit();
	}

	public void addUser() {
		webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > "
				+ "td > div > center > table > tbody > tr > td:nth-child(2) >"
				+ " p > small > a:nth-child(6)")).click(); //clicks button to add user
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > "
				+ "center > table > tbody > tr > td:nth-child(1) > div > center > table > "
				+ "tbody > tr:nth-child(1) > td:nth-child(2) > p > input")).sendKeys(userName); //type the desired user name
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > "
				+ "center > table > tbody > tr > td:nth-child(1) > div > center > table > "
				+ "tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]")).sendKeys(userPass); //types the desired pass
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > "
				+ "center > table > tbody > tr > td:nth-child(1) > div > center > table > "
				+ "tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]")).click();
	}
	
	public void userLogin() {
		webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) >"
				+ "td > div > center > table > tbody > tr > td:nth-child(2) > p > "
				+ "small > a:nth-child(7)")).click(); //clicks the login option on home page
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody "
				+ "> tr > td:nth-child(1) > table > tbody > "
				+ "tr:nth-child(1) > td:nth-child(2) > p > input")).sendKeys(userName); //types the user name into selected field
	
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > "
				+ "tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) >"
				+ " td:nth-child(2) > p > input[type=\"password\"]")).sendKeys(userPass); //types the password into the selected field
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > "
				+ "tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > "
				+ "td:nth-child(2) > p > input[type=\"button\"]")).click(); //click the "test login" number to enter login

	}
}
