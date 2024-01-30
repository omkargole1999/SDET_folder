package Lab_jan25;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class Cucumber_lab {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = ".//feature/login.feature" ,
			glue = "Lab_jan25" ,
			//dryRun = true,
			plugin = {"pretty" , "html: target/HtmlReports"}
			
			)

	public class TestRun {
	   
	}


}
