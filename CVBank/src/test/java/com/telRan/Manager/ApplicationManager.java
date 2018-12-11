package com.telRan.Manager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private UserHelper userHelper;
    private NavigationHelper navigationHelper;
    private CompanyHelper companyHelper;
    private CreateCVHelper createCVHelper;
    public WebDriver wd;

    public void start(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //wd.navigate().to("https://cv-app-test.herokuapp.com");
        wd.navigate().to("https://cvbank.soft-gen.com/");
        createCVHelper = new CreateCVHelper(wd);
        companyHelper = new CompanyHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        userHelper = new UserHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

    public CreateCVHelper getCreateCVHelper() {
        return createCVHelper;
    }

    public CompanyHelper getCompanyHelper() {
        return companyHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

}
