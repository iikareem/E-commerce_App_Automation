package Step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;
import Step_definition.hook;

public class A3_ResetPasswordAction {
    @Given("User at  home page and click to log in")
    public void loginTab() {
        hook.driver.findElement(By.className("ico-login")).click();
    }
    @And("User clicks on forget password")
    public void forgetTab() {
        hook.driver.findElement(By.linkText("Forgot password?")).click();
    }
    @And("User enter his email address")
    public void enterEmailAddress()
    {
        hook.driver.findElement(By.name("Email")).sendKeys("kareemashraf@gmail.com");

    }
    @And("user click Recover Password Button")
    public void clickRecover() {
        hook.driver.findElement(By.className("password-recovery-button")).click();
    }
    @And("The Success message is displayed")
    public void display_msg()
    {
        Assert.assertTrue(hook.driver.findElement(By.className("content")).isDisplayed());
        Assert.assertTrue(hook.driver.findElement(By.className("content")).getText().contains("Email with instructions has been sent to you."));


    }
}
