package lab_Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006_WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		System.out.println(driver.getWindowHandle());
		//implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(60));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("multi")));
		//driver.findElement(By.id("mti")).click();
		List<String> li = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Size : "+li.size());
		System.out.println(li);
		for(int i = 0;i < li.size();i++)
		{
			System.out.println(li.get(i));
		}
		driver.switchTo().window(li.get(0));
		System.out.println("The URL is"+driver.getCurrentUrl());
		driver.switchTo().window(li.get(1));
		System.out.println("The URL is"+driver.getCurrentUrl());
		driver.switchTo().window(li.get(2));
		
				driver.quit();
	}

}
