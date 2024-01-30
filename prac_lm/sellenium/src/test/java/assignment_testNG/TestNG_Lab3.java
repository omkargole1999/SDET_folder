package assignment_testNG;

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
import lab3_.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Lab3 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		democart_repo obj = new democart_repo(driver);
		
	obj.desktop();
			
		
		obj.mac();
		
		obj.sort(n);
			
		
	   obj.addcart();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is before class");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
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
	  System.out.println("This is after Test");
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
