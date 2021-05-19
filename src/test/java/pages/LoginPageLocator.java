package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLocator{
    public WebDriver ldriver;

    public LoginPageLocator(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "txtUsername") public WebElement username;
    @FindBy(id = "txtPassword") public WebElement userpsw;
    @FindBy(id = "btnLogin") public WebElement loginBtn;

    public void getUserName(String uname){

        username.sendKeys(uname);
    }
    public void getUserPsw(String upsw){

        userpsw.sendKeys(upsw);
    }
    public void clickOnLoginBtn(){

        loginBtn.click();
    }
}
