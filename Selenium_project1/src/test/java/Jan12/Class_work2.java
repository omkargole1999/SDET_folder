package Jan12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_work2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Login")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("omi22@gmail.com");
	    driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("omi22");
	    driver.findElement(By.tagName("button")).click();
	    
	    WebElement ele = driver.findElement(By.linkText("Components"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Monitors (2)")).click();
		Select show = new Select(driver.findElement(By.xpath("//select[@id=\"input-limit\"]")));
		show.selectByIndex(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Hello');");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,500)");		
		driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[1]/form/div/div[2]/div[1]/h4/a")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.name("option[218]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.id("input-option-value-9")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Select select2 = new Select(driver.findElement(By.xpath("input-option-217")));
		select2.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.id("input-option-209")).sendKeys("This is MAC ");
		
		driver.findElement(By.id("input-option-219")).clear();
		driver.findElement(By.id("input-option-219")).sendKeys("01/02/2024");
		driver.findElement(By.id("input-option-2210")).clear();
		driver.findElement(By.id("input-option-2210")).sendKeys("12:23");
		driver.findElement(By.id("button-cart")).click();
		

	}

}
