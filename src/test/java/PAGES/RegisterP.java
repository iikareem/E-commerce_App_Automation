package PAGES;

import org.openqa.selenium.By;

public class RegisterP {
    public By registerBTN(){
        return By.className("ico-register");
    }
    public By Gender(){
        return By.id("gender-male");
    }
    public By FirstName(){
        return By.id("FirstName");
    }
    public By LastName ()
    {
        return By.name("LastName");
    }
    public By Date (String Nam,String Val)
    {
        By Date=By.cssSelector("select[name=\""+Nam+"\"] > option[value=\""+Val+"\"]");
        return Date;
    }

    public By Email ()
    {
        return By.id("Email");
    }

    public By Company ()
    {
        return By.id("Company");
    }

    public By Newsletter(){
        return By.id("Newsletter");
    }
    public By Password ()
    {
        return By.id("Password");
    }
    public By ConfirmPassword ()
    {
        return By.id("ConfirmPassword");
    }
    public By RegisterBTN ()
    {
        return By.id("register-button");
    }








}
