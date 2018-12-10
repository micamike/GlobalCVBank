package com.telRan.Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void clickLoginButton(){
        click(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),'Log in')]"));
    }

    public void clickLogout(){
        click(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),'Sign Out')]"));
    }

    public void clickRegisterButton(){
        click(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),'Register')]"));
    }

    public void clickHomepageButton(){
        click(By.xpath("//div[@class='header-logo p-2 text-left cv-logo title-header-logo']//span"));
    }

    public void clickProfilButton(){
        click(By.cssSelector("div.grid-container div.main ul.menu-btns app-btns-logged:nth-child(2) li:nth-child(2) > button.btn.btn-danger"));
    }

    public void clickCloseButton(){
        click(By.xpath("//button[@class='btn btn-close']"));
    }

    public void fillLogIn(String email, String password){
        type(By.name("username"), email);
        type(By.name("password"), password);
        click(By.xpath("//button[@type='submit']"));
    }
    public void logIn() {
        clickLoginButton();
        fillLogIn("micamike@hotmail.com","mickael55");
        clickCloseButton();
    }
}
