package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class MainMenuTest {

	WebDriver driver;
	WebElement element;
	String first, second;
	Set<String> set;
	Iterator<String> it;

	@Before(order=0)
	public void globalBefore(){
		System.out.println("Global Before Method");
	}
	
	@After(order=0)
	public void globalAfter(){
		driver.close();
		driver.switchTo().window(first);
		System.out.println("Global After Method");
	}
	
	@Before(order=1)
	public void localBefore(){
		System.out.println("Local Before Method");
	}
	
	@After(order=1)
	public void localAfter(){
		driver.close();
		System.out.println("Local After Method");
	}
	
	
	@Given("^user present on HomePage$")
	public void user_present_on_HomePage() {
		System.setProperty("webdriver.chrome.driver", "E:\\JAR\\SeleniumJAR\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sharekhan.com");

		try {
			element = driver.findElement(By.xpath("//a[text()=\"Login/Trade\"]"));
			element.click();

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		set = driver.getWindowHandles();
		it = set.iterator();

		first = it.next();
		second = it.next();

		driver.switchTo().window(second);

		try {
			element = driver.findElement(By.xpath("//input[@name=\"emailLoginId\"]"));
			element.sendKeys("JALAJ8772");
			element.sendKeys(Keys.ENTER);

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			element = driver.findElement(By.xpath("//input[@type=\"password\"]"));
			element.sendKeys("FORAM@28");
			element.sendKeys(Keys.ENTER);

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("^verify PORTFOLIO$")
	public void verify_PORTFOLIO() {

		try {
			element = driver.findElement(By.xpath("//span[text()=\"PORTFOLIO\"]"));
			boolean f = element.isDisplayed();
			Assert.assertTrue(f);

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Then("^verify ACCOUNTS$")
	public void verify_ACCOUNTS() {

		try {
			element = driver.findElement(By.xpath("//span[text()=\"ACCOUNTS\"]"));
			boolean f = element.isDisplayed();
			Assert.assertTrue(f);

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

	@Then("^verify MARKETWATCH$")
	public void verify_MARKETWATCH() {

		try {
			element = driver.findElement(By.xpath("//span[text()=\"MARKETWATCH\"]"));
			boolean f = element.isDisplayed();
			Assert.assertTrue(f);

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
