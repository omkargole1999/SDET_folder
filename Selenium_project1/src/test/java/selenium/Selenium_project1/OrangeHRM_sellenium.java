package selenium.Selenium_project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Sellenium_repo.orangeHRM_repo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_sellenium {
	public static void main(String args []) throws Exception
	{
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
//	driver.findElement(By.name("username")).sendKeys("Admin");
//	driver.findElement(By.name("password")).sendKeys("admin123");
//	driver.findElement(By.xpath("//button[@type='submit']")).submit();
	
	 orangeHRM_repo obj = new  orangeHRM_repo(driver);
	 obj.enterusername("Admin");
	 obj.enterpassword("admin123");
	 obj.clicklogin();
	 
	}
}
