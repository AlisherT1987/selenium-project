package com.cydeo.tests.review.week3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HardSoftAssertion {

    // TC#1: Registration Form Page Testing
    // 1. Open Chrome browser
    // 2. Go to https://practice.cydeo.com/registration_form
    // 3. Verify title is as expected:
    // Expected: "Registration Form"
    // 4. Select "SDET" from Job title dropdown
    // 5. Verify "SDET" is selected


    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        // TC#1: Registration Form Page Testing
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 2. Go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

    }

    @Test
    public void registration_form_page_hardAssert_test(){

    }


}
