package com.symund.pages;

import com.symund.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "user")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(id = "lost-password")
    public WebElement forgetPasswordButton;

    @FindBy(className = "toggle-password")
    public WebElement togglePassword;


    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public boolean verifyLoginPage(){
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedUrl = "https://qa.symund.com/index.php/login";
        return actualUrl.contains(expectedUrl);
    }


}
