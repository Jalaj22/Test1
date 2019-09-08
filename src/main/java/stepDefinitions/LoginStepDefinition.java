/*package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	WebDriver driver;
	WebElement element;
	Set<String> handle;
	Iterator<String> it;
	String first, second;
	String actual, expected;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "E:\\JAR\\SeleniumJAR\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sharekhan.com");
		element = driver.findElement(By.xpath("//a[text()=\"Login/Trade\"]"));
		element.click();

		handle = driver.getWindowHandles();
		it = handle.iterator();
		first = it.next();
		second = it.next();

		driver.switchTo().window(second);
	}

	@When("^title of login page is Sharekhan Online Trading Account Login$")
	public void title_of_login_page_is_Sharekhan_Online_Trading_Account_Login() {
		actual = driver.getTitle();
		expected = "Sharekhan Online Trading Account Login";
		Assert.assertEquals(expected, actual);
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		element = driver.findElement(By.xpath("//input[@name=\"emailLoginId\"]"));
		element.sendKeys(username);

		element.sendKeys(Keys.ENTER);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		element = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		element.sendKeys(password);

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		element = driver
				.findElement(By.xpath("//button[@type=\"submit\" and @class=\"blk-lg-button col-sm-12 ng-binding\"]"));
		element.click();
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() {
		actual = driver.getTitle();
		expected = "Sharekhan Online Trading Account Login";
		Assert.assertEquals(expected, actual);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^click on MarketWatch$")
	public void click_on_MarketWatch() {

		try {

			element = driver.findElement(By.xpath("//span[text()=\"MARKETWATCH\"]"));
			element.click();

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^click on Create Watchlist$")
	public void click_on_Create_Watchlist() {

		try {

			element = driver.findElement(By.xpath("//button[text()=\"Create Watchlist\"]"));
			element.click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^enter \"([^\"]*)\" name$")
	public void enter_name(String str) {

		try {
			element = driver.findElement(By.xpath("//input[@name=\"newWatchlist\"]"));
			element.sendKeys(str);

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^click on OK button$")
	public void click_on_OK_button() {

		try {
			element = driver.findElement(By.xpath("//button[text()=\"OK\"]"));
			element.click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^click on Close button$")
	public void click_on_Close_button() {

		try {

			element = driver.findElement(By.xpath("//button[text()=\"Close\"]"));
			element.click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^enter intrested \"([^\"]*)\" name$")
	public void enter_intrested_name(String str) {

		try {
			element = driver.findElement(By.xpath("//input[@placeholder=\"Enter the script name\"]"));
			element.sendKeys(str);

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^click on ADD button$")
	public void click_on_ADD_button() {
		
		
		
		try {
			element = driver.findElement(By.xpath("//button[text()=\"ADD\"]"));
			element.click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.close();
		driver.switchTo().window(first);
		driver.close();
	}
}
*/