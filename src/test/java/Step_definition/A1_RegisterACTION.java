package Step_definition;

import PAGES.RegisterP;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class A1_RegisterACTION {

    RegisterP register = new RegisterP();

    @Given("User at home page and click to register tab")
    public void registerTab() {
        hook.driver.findElement(register.registerBTN()).click();
    }

    @And("User enter his valid data to complete register")
    public void enterValidData() {
        hook.driver.findElement(register.Gender()).click();
        hook.driver.findElement(register.FirstName()).sendKeys("Kareem");
        hook.driver.findElement(register.LastName()).sendKeys("Ashraf");
        hook.driver.findElement(register.Date("DateOfBirthDay", "3")).click();
        hook.driver.findElement(register.Date("DateOfBirthMonth", "2")).click();
        hook.driver.findElement(register.Date("DateOfBirthYear", "2001")).click();
        hook.driver.findElement(register.Email()).sendKeys("kareemashraf@gmail.com");
        hook.driver.findElement(register.Newsletter()).click();
    }

    @And("User enter his valid data to Company section")
    public void enterCompanyData() {
        hook.driver.findElement(register.Company()).sendKeys("Udacity");

    }

    @And("User enter his valid Password")
    public void enterPasswordData() {
        hook.driver.findElement(register.Password()).sendKeys("UDACITY_COURSE");
        hook.driver.findElement(register.ConfirmPassword()).sendKeys("UDACITY_COURSE");
    }

    @And("User clicks on register button")
    public void RegisterBTN() {
        hook.driver.findElement(register.RegisterBTN()).click();
    }

    @And("The Registartion done successfully")
    public void Registartion_done() {

    String Color = hook.driver. findElement(By.cssSelector("div[class=\"result\"]")).getCssValue("color");
    SoftAssert soft = new SoftAssert();
    soft.assertTrue(hook.driver. findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());
    soft.assertTrue(hook.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
    soft.assertTrue(hook.driver.findElement(By.cssSelector("a[href=\"/customer/info\"][class=\"ico-account\"]")).isDisplayed());
    soft.assertEquals(Color,"rgba(76, 177, 124, 1)");
    soft.assertAll();




    }
}
