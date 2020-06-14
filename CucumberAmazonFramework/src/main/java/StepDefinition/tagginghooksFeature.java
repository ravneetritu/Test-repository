package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tagginghooksFeature {
	
	
	//Global hooks: run after each and every scenario
	
	@Before(order=0)  //This is similar to @BeforeClass in testNG and will run before all the scenarios
	public void setUp(){
		System.out.println("launch FF");
		System.out.println("Enter URL of Amazon");
	}
	
	@After (order=0)    //This is similar to @AfterClass in testNG and will run after all the scenarios
	public void tearDown(){
		System.out.println("Close the browser");
	}
	
	@Before  (order=1)  //This is similar to @BeforeClass in testNG and will run before all the scenarios
	public void setUp1(){
		System.out.println("launch FF1");
		System.out.println("Enter URL of Amazon1");
	}
	
	@After (order=1)    //This is similar to @AfterClass in testNG and will run after all the scenarios
	public void tearDown1(){
		System.out.println("Close the browser1");
	}
	
	
	
	//Local Hooks
	
	@Before ("@First")     //This is similar to @BeforeMethod in testNG and will run only before the first scenario
	public void beforeFirst(){
		System.out.println("Before only first scenario");
	}
	
	@After ("@First")  //This is similar to @AfterMethod in testNG and will run only after the first scenario
	public void afterFirst(){
		System.out.println("After only first scenario");
	}
	
	@Before ("@Second")
	public void beforeSecond(){
		System.out.println("Before only second scenario");
	}
	
	@After ("@Second")
	public void afterSecond(){
		System.out.println("After only second scenario");
	}
	
	@Before ("@Third")
	public void beforeThird(){
		System.out.println("Before only third scenario");
	}
	
	@After ("@Third")
	public void afterThird(){
		System.out.println("After only third scenario");
	}
	
	
	@Given("this is first step")
	public void this_is_first_step() {
	   System.out.println("1st step");
	}

	@When("this is second step")
	public void this_is_second_step() {
		System.out.println("2nd step");

	}

	@Then("this is third step")
	public void this_is_third_step() {
		System.out.println("3rd step");

	}

}
