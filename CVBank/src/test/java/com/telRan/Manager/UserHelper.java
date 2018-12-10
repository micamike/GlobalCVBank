package com.telRan.Manager;

import com.telRan.Data.UserFormData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {


    public UserHelper(WebDriver wd) {
        super(wd);
    }

     public void fillUserForm(UserFormData userFormData){
        type(By.id("firstName"), userFormData.getFirstName());
        type(By.id("lastName"), userFormData.getName());
        type(By.id("email"), userFormData.getEmail());
        type(By.id("phone"), userFormData.getPhone());
        type(By.id("password"), userFormData.getPass());
        type(By.id("password-confirm"), userFormData.getConfirmPass());
        click(By.xpath("//button[@type='submit']"));
    }
}
