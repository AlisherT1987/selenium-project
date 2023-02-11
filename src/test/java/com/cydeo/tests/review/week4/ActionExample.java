package com.cydeo.tests.review.week4;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionExample {

    @Test
    public void testhover() {;

        Actions actions=new Actions(Driver.getDriver());
        DashboardPage dashboardPage=new DashboardPage();
        for (WebElement eachMenu : dashboardPage.main_menus) {

            actions.moveToElement(eachMenu);
            BrowserUtils.sleep(1);
        }




    }
}
