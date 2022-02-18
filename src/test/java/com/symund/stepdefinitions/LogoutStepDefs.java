package com.symund.stepdefinitions;

import com.symund.pages.DashboardPage;
import com.symund.pages.LoginPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefs {

    @When("User clicks on profile icon")
    public void user_clicks_on_profile_icon() {
        new DashboardPage().profileIcon.click();
    }

    @When("User clicks the logout button")
    public void user_clicks_the_logout_button() {
        new DashboardPage().logoutButton.click();
    }

    @Then("User should end up in the login page")
    public void user_should_end_up_in_the_login_page() {
        Assert.assertTrue(new LoginPage().verifyLoginPage());
    }

    @And("User navigates back to Dashboard")
    public void user_navigates_back_to_Dashboard() {
        Driver.get().navigate().back();
    }

    @Then("User should not be able to go back Dashboard again")
    public void user_should_not_be_able_to_go_back_Dashboard_again() {
        Assert.assertTrue(new LoginPage().verifyLoginPage());
    }

}
