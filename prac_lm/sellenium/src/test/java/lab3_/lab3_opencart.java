package lab3_;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab3_opencart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.linkText("Desktops"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Mac (1)")).click();  
		Select show = new Select(driver.findElement(By.id("input-sort")));
		show.selectByIndex(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Hello');");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"product-list\"]/div/form/div/div[2]/div[1]/h4/a")).click();
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		driver.findElement(By.id("button-cart")).click();
		
	}	

}
