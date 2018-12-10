package com.telRan.Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCVHelper extends HelperBase {

    public CreateCVHelper(WebDriver wd) {
        super(wd);
    }

    public void clickCreateCVButton(){
        click(By.xpath("//button[contains(text(),'Create')]"));
    }

    public void clickdoubledownButton(){
        click(By.xpath("//i[@class='fas fa-angle-double-down']"));
    }

    public void fillBirthday(By locator, String bd){
            wd.findElement(locator).click();
            wd.findElement(locator).sendKeys(bd);
    }

    public void fillCVFooter(String link, String recom) {
        type(By.xpath("//input[@placeholder='linkedin link']"), link);
        type(By.xpath("//textarea[@placeholder='recommendation']"), recom);
    }

    public void clickCVLanguages() {
        click(By.xpath("//div[@id='languages']//div//div"));
        click(By.xpath("//option[@value='35: 34']"));
        click(By.xpath("//button[@title='Add Language']"));
        click(By.xpath("//div[@id='languages']//div//div[2]"));
        click(By.xpath("//div//div[2]//select[1]//option[30]"));
        click(By.xpath("//button[@title='Add Language']"));
        click(By.xpath("//div[@id='languages']//div//div[3]"));
        click(By.xpath("//div//div[3]//select[1]//option[46]"));

    }

    public void fillCVCertification(String diplome, String year) {
        type(By.xpath("//div[@id='certifications']//div//textarea[@placeholder='description*']"), diplome);
        type(By.xpath("//div[@id='certifications']//div//input[@placeholder='graduation year*']"), year);
    }

    public void fillCVAchievements(String achiev, String year) {
        type(By.xpath("//div[@id='achievements']//div//textarea[@placeholder='description*']"), achiev);
        type(By.xpath("//div[@id='achievements']//div//input[@placeholder='graduation year*']"), year);
    }

    public void fillCVProjects(String society, String position, String yearBegin, String yearEnd, String text) {
        type(By.xpath("//input[@placeholder='company*']"), society);
        type(By.xpath("//input[@placeholder='position*']"), position);
        type(By.xpath("//input[@placeholder='year from']"), yearBegin);
        type(By.xpath("//input[@placeholder='year till']"), yearEnd);
        type(By.xpath("//textarea[@placeholder='project description']"), text);
    }

    public void clickCVSkills() {
        click(By.xpath("//u[contains(text(),\'System Administration\')]"));
        click(By.xpath("//u[contains(text(),'TCP/IP')]"));
        click(By.xpath("//u[contains(text(),'С/C++')]"));
    }

    public void fillCVEducation(String school, String degree, String year, String text) {
        type(By.xpath("//input[@placeholder='school/institution name*']"), school);
        type(By.xpath("//input[@placeholder='degree*']"), degree);
        type(By.xpath("//div[@id='education']//div//input[@placeholder='graduation year*']"), year);
        type(By.xpath("//textarea[@placeholder='description']"), text);
    }

    public void fillCVDescription(String area, String position, String salMin, String salMax) {
        type(By.xpath("//input[@placeholder='choose preferable area']"), area);
        type(By.xpath("//input[@placeholder='choose preferable position']"), position);
        type(By.xpath("//input[@placeholder='Salary from ($)']"), salMin);
        type(By.xpath("//input[@placeholder='Salary till ($)']"), salMax);
    }

    public void fillCVContact(String phone, String email, String address) {
        type(By.xpath("//input[@placeholder='phone*']"), phone);
        type(By.xpath("//input[@placeholder='email*']"), email);
        type(By.xpath("//input[@placeholder='residence']"), address);
    }

    public void fillCVTitle(String job, String fname, String lname, String bd, String summary, String about){
        type(By.xpath("//input[@placeholder='cv title*']"), job);
        type(By.xpath("//input[@placeholder='first name*']"), fname);
        type(By.xpath("//input[@placeholder='last name*']"), lname);
        fillBirthday(By.xpath("//input[@placeholder='birthday']"), bd);
        type(By.xpath("//textarea[@id='summary']"), summary);
        type(By.xpath("//textarea[@id='about']"), about);
    }

    public void clickSaveButton() {
        click(By.xpath("//button[contains(text(),'Save')]"));
    }

    public void createCV(){
        clickCreateCVButton();
        clickdoubledownButton();
        fillCVTitle("QA Automaton", "Mickael", "Aboulkheir", "15121980", "Who's the boss here ???", "Nothing");
        fillCVContact("0533381248", "micamike@hotmail.com", "Eli Cohen");
        fillCVDescription("TEL AVIV", "S", "10000", "15000");
        fillCVEducation("Lycee Jean Vilar", "BAC", "2000", "Bababababa cette fraicheur");
        clickCVSkills();
        fillCVProjects("IBM", "Always Sitting", "2008", "2014", "test");
        fillCVAchievements("I don't understand", "2002");
        fillCVCertification("BAC+2", "2002");
        clickCVLanguages();
        fillCVFooter("mickael.aboulkheir", "To do bon");
        clickSaveButton();
    }
}
