package assignment_testNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import lab12.lab12;
import lab3_.democart_repo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_lab4 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer product1, String product2) {
	  driver.get(URL);
		// democart_repo obj = PageFactory.initElements(driver,democart_repo.class);
		 lab12 obj = new lab12(driver);
			obj.desktop();
			obj.mac();
			obj.sort(1);
			obj.search();
			obj.search2(product1);
			obj.tick();
			obj.searchbutton();
			driver.navigate().back();
			obj.clear();
			obj.search2(product2);
			obj.searchbutton();
			
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
  }

  @AfterMethod
  public void afterMethod() {
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
