package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C://Users//ravneetritu//workspace//CucumberAmazonFramework//src//main//java//Feature//taggingFeature.feature", //path of the feature files
		glue= {"StepDefinition"}, //path of the step definition files
		strict = true, // verify if all the steps are present in step definition file as defined in the feature file
		monochrome= true , // to make the console output more readable
	    plugin={"pretty","html:test-output","json:json_output/cucumber.json"}, //to generate html or json format reports
		dryRun =true,
		tags ={"~@SmokeTest" , "@RegressionTest"}
		
		)

public class TestRunner {

}
// OR: tags = {"@SmokeTest , @RegressionTest"} -- executes all tests tagged as @SmokeTest or @RegressionTest"
// AND: tags = {"@SmokeTest" , "@RegressionTest"} -- executes only those tests tagged both as @SmokeTest and @RegressionTest"
//To ignore specific test cases : use '~' forExample

//WARNING: Passing multiple tags through @CucumberOptions is deprecated.
//Please use a single tag expressions e.g: @CucumberOptions(tags="(@cucumber or @pickle) and not @salad")