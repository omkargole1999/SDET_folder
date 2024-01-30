package Jan12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_selenium{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Automation testing tools");
		
		search.submit();
		System.out.println("After contains "+driver.getPageSource().contains("Automation"));
		driver.navigate().to("https://www.amazon.com/");
		System.out.println("After backward"+driver.getTitle());
		driver.navigate().forward();
		System.out.println("After forward"+driver.getTitle());
		System.out.println("URL : "+driver.getCurrentUrl());
	Thread.sleep(5000);
		driver.quit();

	}

}
