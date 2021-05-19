package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageAction {

    @FindBy(id = "txtUsername") public WebElement username;
    @FindBy(id = "txtPassword") public WebElement userpsw;
    @FindBy(id = "btnLogin") public WebElement loginBtn;
}
