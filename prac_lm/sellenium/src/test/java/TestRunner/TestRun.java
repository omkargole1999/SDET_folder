package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//feature/login.feature" ,
		glue = "Jan25_cucumber" ,
		//dryRun = true,
		plugin = {"pretty" , "html: target/HtmlReports"}
		
		)

public class TestRun {
   
}
