package lab3_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class democart_pageobjectmodel {
    WebDriver driver;
    
    @FindBy(name="username")
    WebElement uname;
    
    @FindBy(name="password")
    WebElement pword;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement loginbutton;
    
    public void username(String username1)
    {
    	uname.sendKeys(username1);
    }
    public void setpassword(String password1)
    {
    	pword.sendKeys(password1);
    }
    public void clickLogin()
    {
    	loginbutton.click();
    }
    
  
}
