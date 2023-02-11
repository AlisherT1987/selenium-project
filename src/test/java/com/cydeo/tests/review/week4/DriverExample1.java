package com.cydeo.tests.review.week4;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverExample1 {
/*
    @Test
    public void test1() {
        //First creating browser
       /* WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("");


        //second one
        // WebDriverFactory.getDriver("chrome");
        //WebDriverFactory.getDriver("chrome");

        //Driver with singleton design pattern

        Driver.getDriver();
        Driver.getDriver();


    }


 */


    @Test
    public void test2() {
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        //username
        WebElement userElement = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        userElement.sendKeys("User1");

        //password
        WebElement passwordElement = Driver.getDriver().findElement(By.cssSelector("#prependedInput2"));
        passwordElement.sendKeys("UserUser123" + Keys.ENTER); //we will use that example in interview
        Driver.closeDriver();
    }


    @Test
    public void test3() {
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        //username
        WebElement userElement = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        userElement.sendKeys("User1");

        //password
        WebElement passwordElement = Driver.getDriver().findElement(By.cssSelector("#prependedInput2"));
        passwordElement.sendKeys("UserUser123" + Keys.ENTER); //we will use that example in interview
        Driver.closeDriver();
    }
}
