package com.telRan.Test;

import com.telRan.Data.CompanyFormData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompanyRegistrationTest extends TestBase {

    @Test
    public void createCompanyByRegister(){

        applicationManager.getNavigationHelper().clickRegisterButton();
        applicationManager.getCompanyHelper().clickCompany();
        applicationManager.getCompanyHelper().fillCompanyForm(new CompanyFormData().setCompany("Mike Air").setWeb("www.MikeAir.com").setCountry("ISRAEL").setCity("Ashkelon").setStreet("Eli Cohen").setBuilding("Nakatomi Plazza").setPhone("054347482").setPostcode("78759").setFirstname("Didier").setName("Bourdon").setPosition("DRH").setEmail("Didier.Bourdon@DRH.fr").setPass("inconnus").setComfirmPass("inconnus"));

        Assert.assertTrue(applicationManager.wd.findElement(By.xpath("//div[@class='message-box']")).isDisplayed());

        applicationManager.getNavigationHelper().clickCloseButton();
        applicationManager.getNavigationHelper().clickLogout();
    }

    @Test
    public void createCompanyByLogin(){

        applicationManager.getNavigationHelper().clickLoginButton();
        applicationManager.getCompanyHelper().clickCompany();
        applicationManager.getCompanyHelper().fillCompanyForm(new CompanyFormData().setCompany("Mike Air").setWeb("www.MikeAir.com").setCountry("ISRAEL").setCity("Ashkelon").setStreet("Eli Cohen").setBuilding("Nakatomi Plazza").setPhone("054347476").setPostcode("78759").setFirstname("Pascal").setName("Legitimus").setPosition("PDG").setEmail("Pascal.Legitimus@DRH.fr").setPass("inconnus").setComfirmPass("inconnus"));

        Assert.assertTrue(applicationManager.wd.findElement(By.xpath("//div[@class='message-box']")).isDisplayed());

        applicationManager.getNavigationHelper().clickCloseButton();
        applicationManager.getNavigationHelper().clickLogout();
    }
}
