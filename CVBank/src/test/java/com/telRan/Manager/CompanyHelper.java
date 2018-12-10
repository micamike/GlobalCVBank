package com.telRan.Manager;

import com.telRan.Data.CompanyFormData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompanyHelper extends HelperBase{

    public CompanyHelper(WebDriver wd) {
        super(wd);
    }

    public void clickCompany(){
        click(By.xpath("//div[@class='right-heading']//h2"));
    }

    public void fillCompanyForm(CompanyFormData companyFormData){

        type(By.id("companyName"), companyFormData.getCompany());
        type(By.id("website"), companyFormData.getWeb());
        type(By.id("country"), companyFormData.getCountry());
        type(By.id("city"), companyFormData.getCity());
        type(By.id("street"), companyFormData.getStreet());
        type(By.id("building"), companyFormData.getBuilding());
        type(By.id("phone"), companyFormData.getPostcode());
        type(By.id("phone-company"), companyFormData.getPhone());
        type(By.id("firstName"), companyFormData.getFirstname());
        type(By.id("lastName"), companyFormData.getName());
        type(By.id("position"), companyFormData.getPosition());
        type(By.id("email"), companyFormData.getEmail());
        type(By.id("password"), companyFormData.getPass());
        type(By.id("confirmPass"), companyFormData.getComfirmPass());
        click(By.xpath("//button[@type='submit']"));
    }
}
