package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_class4 {
	
		WebDriver driver;
	  @Test(dataProvider = "dp")
	  public void f(String uname, String pwd) throws Exception  {	
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
	  
	  
	  @BeforeMethod
	  public void beforeMethod() throws Exception {
		  
		 System.out.println("This is before method");
		 InputStream input1 = new FileInputStream("C:\\Users\\omkar.gole\\eclipse-workspace\\prac_lm\\src\\test\\java\\day5_selenium\\login_data.properties");
			Properties prob = new Properties();
			prob.load(input1);
			String url = prob.getProperty("url");
			System.out.println("The URL is:" + url);
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get(url);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("This is after method");
		 driver.quit();
	  }
	  
	  @DataProvider
	  public Object[][] dp() throws Exception {
		  File f1 = new File("C:\\Users\\omkar.gole\\eclipse-workspace\\prac_lm\\UserData.xlsx");
	      
	      FileInputStream fis = new FileInputStream(f1);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count: "+rowCount);
			String[][] data = new String[3][2];
			
			for(int i=0;i<rowCount;i++) {
				data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
				data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
				String uname = data[i][0];
				String pwd = data[i][1];
				System.out.println("Username: "+uname);
				System.out.println("Password: "+pwd);	
			}
			return data;
	    };
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("This is before class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("This is after class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("This is before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("This is after test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("This is before suite");
	  }
	  

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("This is after suite");
	  }

}
