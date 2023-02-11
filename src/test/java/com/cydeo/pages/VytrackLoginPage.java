package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {

    public VytrackLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement txt_userName;

    @FindBy(css = "#prependedInput2")
    public WebElement txt_password;

    @FindBy(id="_submit")
    public WebElement btn_login;

public void login(){
    txt_userName.sendKeys(ConfigurationReader.getProperty("driver_username"));
    txt_password.sendKeys(ConfigurationReader.getProperty("driver_password"));
    btn_login.click();
}



}
