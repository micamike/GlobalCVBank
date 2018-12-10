package com.telRan.Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogTest extends TestBase {



    @Test
    public void LogoutTest(){

        applicationManager.getNavigationHelper().logIn();
        applicationManager.getNavigationHelper().clickLogout();

        Assert.assertTrue(applicationManager.wd.findElement(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),'Log in')]")).isDisplayed());
    }

    @Test
    public void LoginTest(){

        applicationManager.getNavigationHelper().clickLoginButton();
        applicationManager.getNavigationHelper().fillLogIn("micamike@hotmail.com", "mickael55");

        Assert.assertTrue(applicationManager.wd.findElement(By.xpath("//div[@class='message-box']")).isDisplayed());

        applicationManager.getNavigationHelper().clickCloseButton();
    }

}
