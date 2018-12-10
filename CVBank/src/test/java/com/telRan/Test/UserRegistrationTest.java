package com.telRan.Test;

import com.telRan.Data.UserFormData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest extends TestBase {

    @Test
    public void createUserByRegister(){

        applicationManager.getNavigationHelper().clickRegisterButton();
        applicationManager.getUserHelper().fillUserForm(new UserFormData().setName("Aboulkheir").setFirstName("Mickael").setEmail("micamike"+ System.currentTimeMillis() +"@hotmail.com").setPhone("0533381248").setPass("mickael55").setConfirmPass("mickael55"));

        Assert.assertTrue(applicationManager.wd.findElement(By.xpath("//div[@class='message-box']")).isDisplayed());

        applicationManager.getNavigationHelper().clickCloseButton();
        applicationManager.getNavigationHelper().clickLogout();
    }

    @Test
    public void createUserByLogin(){

        applicationManager.getNavigationHelper().clickLoginButton();
        applicationManager.getUserHelper().fillUserForm(new UserFormData().setName("Aboulkheir").setFirstName("Mickael").setEmail("micamike"+ System.currentTimeMillis() +"@hotmail.com").setPhone("0533381248").setPass("mickael55").setConfirmPass("mickael55"));

        Assert.assertTrue(applicationManager.wd.findElement(By.xpath("//div[@class='message-box']")).isDisplayed());

        applicationManager.getNavigationHelper().clickCloseButton();
        applicationManager.getNavigationHelper().clickLogout();

    }

}
