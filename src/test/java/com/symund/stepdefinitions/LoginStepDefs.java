package com.symund.stepdefinitions;

import com.symund.pages.DashboardPage;
import com.symund.pages.LoginPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
    }
    @When("User clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.loginButton.click();
        //BrowserUtils.waitFor(6);
    }

    @Then("User should be able to launch {string}")
    public void user_should_be_able_to_launch(String title) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains(title));
    }

    @Then("User should be able to see his or her name {string} under profile icon")
    public void user_should_be_able_to_see_his_or_her_name_under_profile_icon(String name) {
        Assert.assertTrue(new DashboardPage().verifyProfileName(name));
    }

    @When("User press enter button")
    public void user_press_enter_button() {
        loginPage.passwordInput.sendKeys(Keys.ENTER);
    }

}
