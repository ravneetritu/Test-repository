/*package StepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
//import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addItemsToCartStepDefinition {
	
WebDriver driver; 
	

	@Given ("^User is already on login page$")
	public void User_is_already_on_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravneetritu\\workspace\\CucumberAmazonFramework\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
	}
	
	@When("Title of the page is Amazon")
	public void title_of_the_page_is_Amazon() {
	  String actualTitle=driver.getTitle();
	  String expectedTitle= "Amazon";
	  Assert.assertTrue("Error: Incorrect title", actualTitle.contains(expectedTitle));
	  System.out.println("Title of the application is: "+actualTitle);
	}

	@Then("User enters username and password")
	public void user_enters_username_and_password(DataTable credentials) throws Exception {
		List<List<String>> data =credentials.cells();
		driver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(2000);
	    driver.findElement(By.id("ap_email")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.id("continue")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("ap_password")).sendKeys(data.get(0).get(1));
	}
	
	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("signInSubmit")).click();
	}

	@Then("User is on home page")
	public void user_is_on_home_page() {
		String actUser =driver.findElement(By.id("nav-your-amazon-text")).getText();
		String expUser= "Ravneet";
	  Assert.assertTrue("Error: User is not on login screen", actUser.contains(expUser));
	}
		
	@And("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}

}
*/