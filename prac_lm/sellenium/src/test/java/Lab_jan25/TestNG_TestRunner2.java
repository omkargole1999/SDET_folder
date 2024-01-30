package Lab_jan25;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Feature/OrangHRM.feature" ,
		glue = "Lab_jan25" ,
		//dryRun = true,
		monochrome = true,
		plugin = {"pretty" , "html: target/HtmlReports"}
		
		)
public class TestNG_TestRunner2 {
           
	
}
