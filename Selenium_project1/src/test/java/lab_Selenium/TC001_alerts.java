package lab_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_alerts {


			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://letcode.in/alert");
				driver.findElement(By.id("accept")).click();
				Thread.sleep(3000);
				Alert simplealert = driver.switchTo().alert();
				System.out.println(simplealert.getText());
				simplealert.accept();
				Thread.sleep(3000);
				driver.findElement(By.id("confirm")).click();
				Alert confirmalert = driver.switchTo().alert();
				System.out.println(confirmalert.getText());
				Thread.sleep(3000)
				;				confirmalert.accept();
				driver.findElement(By.id("prompt")).click();
				Alert promptalert = driver.switchTo().alert();
				System.out.println(promptalert.getText());
				Thread.sleep(3000);
				promptalert.sendKeys("Omkar");
				
				;				promptalert.accept();
			System.out.println(driver.findElement(By.id("myName")).getText());
				

			}

		

	}


