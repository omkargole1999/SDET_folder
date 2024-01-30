package Jan25_cucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import TestNG.orangehrm_pom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_login_cucu {
WebDriver driver;

	@Given("Launch the Chrome browser")
	public void launch_the_chrome_browser() throws IOException {
		 System.out.println("This is before method");
		 
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		
	}

	@When("User opens the url2")
	public void user_opens_the_url2() throws IOException {
		InputStream input1 = new FileInputStream("C:\\Users\\omkar.gole\\eclipse-workspace\\prac_lm\\src\\test\\java\\day5_selenium\\login_data.properties");
		Properties prob = new Properties();
		prob.load(input1);
		String url = prob.getProperty("url");
		System.out.println("The URL is:" + url);
		driver.get(url);    
	}

	@When("User enter the username2 and password2")
	public void user_enter_the_username2_and_password2(String uname , String pwd) throws InterruptedException, IOException {
		 long timestamp= new Date().getTime();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			orangehrm_pom obj = new orangehrm_pom(driver);
			String title= driver.getTitle();
			AssertJUnit.assertEquals(title, "OrangeHRM");
			
			ExtentReports extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(timestamp+"orangereport.html");
			extent.attachReporter(spark);
			ExtentTest test= extent.createTest("Verfiy the title of OrangeHRM");
			if(title.equals("orangeHRM")) {//     change o here
				test.pass("OrangeHRM  title is displayed");
			}
			else {
				Thread.sleep(3000);
				File sfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile = new File("report_Orangehrm1.png");
				FileUtils.copyFile(sfile, dfile);
				String path = dfile.getAbsolutePath();
				test.fail("OrangeHRM  title is not displayed"
						,MediaEntityBuilder.createScreenCaptureFromPath(path).build());
				test.addScreenCaptureFromPath(path);
			}
			
			
			if(obj.verifyusername()) {
				test.pass("username is displayed");
			}
			else {
				Thread.sleep(3000);
				File sfile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile1 = new File("report_Orangehrm2.png");
				FileUtils.copyFile(sfile1, dfile1);
				String path1 = dfile1.getAbsolutePath();
				test.fail("username is not displayed"
						,MediaEntityBuilder.createScreenCaptureFromPath(path1).build());
				test.addScreenCaptureFromPath(path1);
			}
			if(obj.verifypassword()) {
				test.pass("password is displayed");
			}
			else {
				Thread.sleep(3000);
				File sfile3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile3 = new File("report_Orangehrm2.png");
				FileUtils.copyFile(sfile3, dfile3);
				String path2 = dfile3.getAbsolutePath();
				test.fail("password is not displayed"
						,MediaEntityBuilder.createScreenCaptureFromPath(path2).build());
				test.addScreenCaptureFromPath(path2);
			}
			if(obj.verifylogin()) {
				test.pass("login is successfull");
		}
		else {
			Thread.sleep(3000);
			File sfile4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dfile4 = new File("report_Orangehrm3.png");
			FileUtils.copyFile(sfile4, dfile4);
			String path3 = dfile4.getAbsolutePath();
			test.fail("login is not successful"
					,MediaEntityBuilder.createScreenCaptureFromPath(path3).build());
			test.addScreenCaptureFromPath(path3);
		}
			extent.flush();
			
			obj.enterusername(uname);
			obj.enterpassword(pwd);
			obj.clickButton();
			driver.findElement(By.tagName("button")).click();
		    boolean dashboard = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).isDisplayed();
		    AssertJUnit.assertEquals(dashboard, true);	
		
	   
	}

	@And("Click on login button2")
	public void click_on_login_button2() {
		obj.clickButton();
	    
	}
	@Then("Home page should be displayed")
	public void Home_page_display()
	{
		
	}
//
//

}

