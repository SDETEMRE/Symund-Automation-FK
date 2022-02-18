package com.symund.pages;

public class DashboardPage extends BasePage{

    public boolean verifyProfileName(String name){
        String actualName = profileName.getAttribute("title");
        return name.equals(actualName);
    }

}
