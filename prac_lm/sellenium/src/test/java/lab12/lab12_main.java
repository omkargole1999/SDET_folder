package lab12;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import lab3_.democart_repo;

public class lab12_main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  InputStream input1 = new FileInputStream("C:\\Users\\omkar.gole\\eclipse-workspace\\prac_lm\\lab12_democart.properties");
		  Properties prob = new Properties();
		  prob.load(input1);
		  String URL = prob.getProperty("URL");
		  String product1 = prob.getProperty("Product1");
		  String product2 = prob.getProperty("Product2");
		  WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			democart_repo obj2 = new democart_repo(driver);
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

}
