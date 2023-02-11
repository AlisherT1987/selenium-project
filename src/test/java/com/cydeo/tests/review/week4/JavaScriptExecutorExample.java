package com.cydeo.tests.review.week4;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JavaScriptExecutorExample {

    //scroll down

    @Test
    public void testScrollDown() {

        Driver.getDriver().get("https://demoqa.com/text-box");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,10)");
            BrowserUtils.sleep(1);
        }
        Driver.closeDriver();

    }


    //scroll up

    @Test
    public void testScrollUp() {

        Driver.getDriver().get("https://demoqa.com/text-box");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,10)");
            BrowserUtils.sleep(1);
        }

        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,-10)");
            BrowserUtils.sleep(1);
        }
        Driver.closeDriver();

    }

    //scroll to element
    @Test
    public void testScrollToElement() {

        Driver.getDriver().get("https://demoqa.com/automation-practice-form");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
       WebElement element= Driver.getDriver().findElement(By.xpath("//body/div[@id='fixedban']/div/div[1]"));
       BrowserUtils.sleep(5);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.sleep(1);
        Driver.closeDriver();

    }


    //scroll to top


    //scroll tp bottom

    //click with Javascript


}
