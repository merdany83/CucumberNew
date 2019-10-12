package com.vytrack.step_definitions;

import com.vytrack.utils.ConfigurationReader;
import com.vytrack.utils.Driver;
import com.vytrack.utils.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class LoginStepDefinitions {

    Pages pages =new Pages();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
    pages.loginPage().goToLadingPAge();
    }

    @Then("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
    pages.loginPage().login(ConfigurationReader.getProperty("storemanager"),ConfigurationReader.getProperty("storemanagerpassword"));
    }

    @Then("user verifies that {string} page name should be displayed")
    public void user_verifies_that_page_name_should_be_displayed(String expected) {
        Assert.assertEquals(expected,pages.dashboardPage().getPageSubTitle());
    }


    @Then("user logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String string, String string2) {
      pages.loginPage().login(string,string2);
    }

    @Then("user verifies that {string} warning message is dislpayed")
    public void user_verifies_that_warning_message_is_dislpayed(String expected) {
    Assert.assertEquals(expected,pages.loginPage().getErrormessage());
    }
    @Then("user quits")
    public void user_quits() {
        Driver.closeDriver();

    }

}
