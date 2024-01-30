package jan16.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orangehrm_repo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver;
				
				By uname = By.name("username");
				By pword = By.name("password");
				By loginbutton = By.xpath("//button[@type='submit']");
			
				public void enterusername(String username1)
				{
					driver.findElement(uname).sendKeys(username1);
				}
				public void enterpassword(String password1)
				{
					driver.findElement(pword).sendKeys(password1);
				}
				public void clicklogin()
				{
					driver.findElement(loginbutton).click();
				}
				

	}
}


