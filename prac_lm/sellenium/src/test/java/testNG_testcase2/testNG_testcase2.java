package testNG_testcase2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import TestNG_TestCase.TestCase_pom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG_testcase2 {
	WebDriver driver;
	  @Test(dataProvider = "dp")
	  public void f(String fname, String lname, String pass, String upass , String email) throws Exception {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  case2pom obj = new case2pom(driver);
		  TestCase_pom obj1 = new TestCase_pom(driver);
		  long timestamp = new Date().getTime();
		  System.out.println("The time is: "+timestamp);
		  
		  ExtentReports extent=new ExtentReports();
			ExtentSparkReporter spark=new ExtentSparkReporter(timestamp+"luma2.html");
			extent.attachReporter(spark);
			ExtentTest test=extent.createTest("Verify the Title of Luma");
			obj.gotologin();
			String title=driver.getTitle();
			System.out.println("Title: "+title);
		  if(title.equals("Create New Customer Account"))
			{
				test.pass("Luma title is displayed");
				
			}
			else
			{
				Thread.sleep(3000);
				File sfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile = new File("C:\\Users\\omkar.gole\\eclipse-workspace\\prac_lm\\test-output\\lumatitle.png");
				FileUtils.copyFile(sfile, dfile);
				String path = dfile.getAbsolutePath();
				test.fail("Luma title is not displayed"
						,MediaEntityBuilder
						.createScreenCaptureFromPath(path)
						.build());
				//test.addScreenCaptureFromPath(path);
			}
			if(obj.verifyusername())
			{
				test.pass("Luma User is displayed");
				
			}
			else
			{
				Thread.sleep(3000);
				File sfile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile1 = new File("C:\\Users\\omkar.gole\\eclipse-workspace\\prac_lm\\test-outputs\\userverify.png");
				FileUtils.copyFile(sfile1, dfile1);
				String path1 = dfile1.getAbsolutePath();
				test.fail("Username is not displayed"
						,MediaEntityBuilder
						.createScreenCaptureFromPath(path1)
						.build());
				//test.addScreenCaptureFromPath(path);
			}
			if(obj.verifypassword())
			{
				test.pass("Password is displayed");
				
			}
			else
			{
				Thread.sleep(3000);
				File sfile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile2 = new File("C:\\Users\\omkar.gole\\eclipse-workspace\\prac_lm\\test-output\\passverify.png");
				FileUtils.copyFile(sfile2, dfile2);
				String path2 = dfile2.getAbsolutePath();
				test.fail("password is not displayed"
						,MediaEntityBuilder
						.createScreenCaptureFromPath(path2)
						.build());
				//test.addScreenCaptureFromPath(path);
			}
//			
////			 
			 obj.entername(email);
			  obj.enterpword(upass);
			  obj.clicklogin();
			 
		  JavascriptExecutor js = (JavascriptExecutor)driver;
//		  //js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
//		  obj.enterpword(pass);
//		  obj.confirmpass(upass);
		  js.executeScript("window.scrollBy(0,1500)");
		   Thread.sleep(3000);
		  
		  if(obj.verifylogin())
			{
				test.pass("Login Successful");
				
			}
			else
			{
				Thread.sleep(3000);
				File sfile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile3 = new File("C:\\Users\\omkar.gole\\eclipse-workspace\\prac_lm\\test-output\\luma.png");
				FileUtils.copyFile(sfile3, dfile3);
				String path3 = dfile3.getAbsolutePath();
				test.fail("Login not Successful"
						,MediaEntityBuilder
						.createScreenCaptureFromPath(path3)
						.build());
				//test.addScreenCaptureFromPath(path);
			}
		  
	
		   Thread.sleep(3000);
		  //obj.clicklogin();
		  
		  obj.menshopclick();
		  obj.addcart();
		  obj.selectsize();
		  obj.selectclr();
		  obj.addtocart();
		  obj.checkcart();
		  Thread.sleep(3000);
		  if(obj.checkitem()) {
			  test.pass("item added");
		  }else {
			  Thread.sleep(3000);
			  File sfile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  File dfile4 = new File("D:\\Training\\Eclipse\\Jan2024_SeleniumClass\\verifylogin.png");
			  FileUtils.copyFile(sfile4, dfile4);
			  String path4 = dfile4.getAbsolutePath();
			  test.fail("Login not Successful"
					  ,MediaEntityBuilder
					  .createScreenCaptureFromPath(path4)
					  .build());
		  }
		  
		  extent.flush();
		  
	  }
	  @Parameters("Browser")
	  @BeforeMethod
	  public void beforeMethod(String browsername) throws Exception {
		  System.out.println("This is before method");
			 InputStream input1 = new FileInputStream("C:\\Users\\omkar.gole\\eclipse-workspace\\prac_lm\\src\\test\\java\\testNG_testcase2\\luma.properties");
				Properties prob = new Properties();
				prob.load(input1);
				String url = prob.getProperty("url");
				System.out.println("The URL is:" + url);
				System.out.println("The Browser is:" + browsername);
				
				if(browsername.equalsIgnoreCase("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					driver.get(url);		
				}
				else if(browsername.equalsIgnoreCase("edge")) {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					driver.get(url);		
				}
				else if(browsername.equalsIgnoreCase("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					driver.get(url);		
				}
			
				
				Thread.sleep(3000);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  }
	  

	  @AfterMethod
	  public void afterMethod() {
	  }


	  @DataProvider
	  public Object[][] dp() throws Exception {
		  File f1 = new File("C:\\Users\\omkar.gole\\eclipse-workspace\\prac_lm\\src\\test\\java\\luma.xlsx");
	      FileInputStream fis = new FileInputStream(f1);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count: "+rowCount);
			String[][] data = new String[1][5];
			
			for(int i=0;i<rowCount;i++) {
				data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
				data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
				data[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
				data[i][3]=sheet.getRow(i).getCell(3).getStringCellValue();
				data[i][4]=sheet.getRow(i).getCell(4).getStringCellValue();
				String fname = data[i][0];
				String lname = data[i][1];
				String pass = data[i][2];
				String upass = data[i][3];
				String email = data[i][4];
				System.out.println("Firstname: "+fname);
				System.out.println("Lastname: "+lname);
				System.out.println("password: "+pass);
				System.out.println("confirm Password: "+upass);	
				System.out.println("email id: "+email);
			}
			return data;
	  }
	  @BeforeClass
	  public void beforeClass() {
	  }

	  @AfterClass
	  public void afterClass() {
	  }

	  @BeforeTest
	  public void beforeTest() {
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	  @BeforeSuite
	  public void beforeSuite() {
	  }

	  @AfterSuite
	  public void afterSuite() {
	  }

}
