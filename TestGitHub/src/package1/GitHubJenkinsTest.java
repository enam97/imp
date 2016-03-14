package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GitHubJenkinsTest {
	

	
	@Test (priority = 0)
	public void TC1_testOnFaceBook() throws InterruptedException {
		
		//Printing Id of the thread on using which test method got executed
		System.out.println("Test Case TC1_testOnFaceBook with Thread Id:- "
				+ Thread.currentThread().getId());
		
		
		
		
		System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//		driver = new FirefoxDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		Reporter.log("Title for Facebook: "+ driver.getTitle());
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test (priority = 1)
	public void TC2_testOnGoogle() throws InterruptedException {
		
		//Printing Id of the thread on using which test method got executed
		System.out.println("Test Case TC2_testOnGoogle with Thread Id:- "
				+ Thread.currentThread().getId());
		
		
	/*	System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();*/
		
		
		
		System.out.println("Executing on Chrome Browser");
		System.setProperty("webdriver.chrome.driver",
				"D:\\Java source files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://www.google.com");
		Reporter.log("Title for Google: "+ driver.getTitle());
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test (priority = 2)
	public void TC3_testOnYahoo() throws InterruptedException{
		
		//Printing Id of the thread on using which test method got executed
		System.out.println("Test Case TC3_testOnYahoo with Thread Id:- "
				+ Thread.currentThread().getId());
		
		
		System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoo.com");
		Reporter.log("Title for Yahoo: " + driver.getTitle());
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}

}
