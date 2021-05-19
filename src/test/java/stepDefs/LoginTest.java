package stepDefs;

import base.Base;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPageLocator;

public class LoginTest extends Base{
//    public WebDriver driver;
    LoginPageLocator lpl;
    @Given("I launch the chrome browser")
    public void i_launch_the_chrome_browser() {
       setUp();
    }

    @When("when enter the URL {string}")
    public void when_enter_the_url(String webUrl) {
       getPage(webUrl);
    }

    @When("Enter valid username {string} and valid password {string}")
    public void enter_valid_username_and_valid_password(String un, String up) throws Exception {
       lpl=new LoginPageLocator(driver);
       lpl.getUserName(un);
       lpl.getUserPsw(up);
       Thread.sleep(3000);
    }

    @Then("click on Login button")
    public void click_on_login_button() {
        lpl.clickOnLoginBtn();
    }

    @Then("close browser")
    public void close_browser() {
        driver.close();
    }
}
