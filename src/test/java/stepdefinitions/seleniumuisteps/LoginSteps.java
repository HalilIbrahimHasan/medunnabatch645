package stepdefinitions.seleniumuisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPageElements;
import pages.LoginPage;
import utilities.Driver;

public class LoginSteps {


    CommonPageElements cp = new CommonPageElements();
    LoginPage login = new LoginPage();


    @Given("user navigates to lending page {string}")
    public void user_navigates_to_lending_page(String url) {

        Driver.navigateToUrl(url);
    }
    @Given("user navigates to sign in portal")
    public void user_navigates_to_sign_in_portal() {

        Driver.waitAndClick(cp.signInAndRegistrationPortal);
    }
    @Given("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {

        Driver.waitAndClick(cp.signIn);
    }
    @When("user provides the username as {string}")
    public void user_provides_the_username_as(String username) {

        Driver.waitAndSendText(login.username, username);
    }
    @When("user provides the password as {string}")
    public void user_provides_the_password_as(String password) {

        Driver.sleep(1000);
        Driver.waitAndSendText(login.password, password);

    }


    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
      Driver.waitAndClick(login.loginButton);
    }
}
