package stepdefinitions.seleniumuisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class RegistrationSteps {

    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user is on the registration page")
    public void user_is_on_the_registration_page() {



    }

    @Given("user enters ssn number as {string}")
    public void user_enters_ssn_number_as(String ssn) {


        Driver.waitAndSendText(registrationPage.ssnTextbox,ssn);


    }

    @Then("user enters firstname and lastname as {string} and {string}")
    public void user_enters_firstname_and_lastname_as_and(String firstname, String lastname) {



        Driver.waitAndSendText(registrationPage.firstnameTextbox,firstname,5);
        Driver.waitAndSendText(registrationPage.lastnameTextbox,lastname,7);

    }



    @Then("user provides a username {string}")
    public void user_provides_a_username(String username) {


        Driver.waitAndSendText( registrationPage.usernameTextbox,username,5);



    }

    @Then("user provides email id as {string}")
    public void user_provides_email_id_as(String email) {

        Driver.waitAndSendText(registrationPage.emailTextbox,email,5);

    }

    @When("user enters the password as {string}")
    public void user_enters_the_password_as(String firstPassword) {
        Driver.sleep(1000);

        Driver.waitAndSendText( registrationPage.firstPasswordTextbox,firstPassword,5);


    }

    @When("user confirms the new password {string}")
    public void user_confirms_the_new_password(String secondPassword) {
        Driver.sleep(1000);

        Driver.waitAndSendText(registrationPage.newPasswordTextbox,secondPassword,5);
    }

    @Then("user clicks on register button and sees the success message as {string}")
    public void user_clicks_on_register_button_and_sees_the_success_message_as(String expectedMessage) {

        Driver.waitAndClick(registrationPage.registerButton);
        Driver.sleep(1000);
        Assert.assertTrue("Registration has failed! ",registrationPage.successMessageToastContainer.isDisplayed());


    }

    @Then("user reads all registrant data")
    public void user_reads_all_registrant_data() {





    }

}
