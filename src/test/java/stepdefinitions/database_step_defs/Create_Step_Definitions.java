package stepdefinitions.database_step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DBUtils;

public class Create_Step_Definitions {

    @When("user creates a new hotel with this values {string}")
    public void user_creates_a_new_hotel_with_this_values(String hotelData) {
        String query ="INSERT INTO tHOTEL (Code,Name,Address,Phone,Email,CreateDate,CreateUser) " +
                "VALUES ("+hotelData+");";

        DBUtils.executeQuery(query);
    }


    @Then("verify the creation is successful")
    public void verify_the_creation_is_successful() {
        //Asserting if tHOTEL table Name column contains Royal King Hotel - the one that we just created
       DBUtils.getColumnData("SELECT Name FROM tHOTEL","Name").toString().contains("Royal King Hotel");
    }


}
