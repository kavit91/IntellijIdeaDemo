package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepDefinition {

    @Given("user navigate to facebook website")
    public void user_navigate_to_facebook_website() {
        System.out.println("user navigate to facebook website");
        Assert.assertTrue(true);
    }

    @When("user validates the homepage title")
    public void user_validates_the_homepage_title() {
        System.out.println("user validates the homepage title");
        Assert.assertTrue(true);
    }

    @Then("user entered valid username")
    public void user_entered_valid_username() {
        System.out.println("user entered the username");
        Assert.assertTrue(true);
    }

    @Then("user entered valid password")
    public void user_entered_valid_password() {
        System.out.println("user entered the password");
        Assert.assertTrue(true);
    }

    @Then("user shouldbe successfully logged in")
    public void user_shouldbe_successfully_logged_in() {
        System.out.println("user should successfully logged in");
        Assert.assertTrue(true);
    }

    @Then("user entered invalid username")
    public void user_entered_invalid_username() {
        System.out.println("user entered invalid username");
        Assert.assertTrue(true);
    }
    @Then("user entered invalid password")
    public void user_entered_invalid_password() {
        System.out.println("user entered invalid password");
        Assert.assertTrue(true);
    }
    @Then("user shouldnot successfully logged in")
    public void user_shouldnot_successfully_logged_in() {
        System.out.println("user shouldnot successfully logged in");
        Assert.assertTrue(true);
    }
}
