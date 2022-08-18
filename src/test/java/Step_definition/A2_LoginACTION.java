package Step_definition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.asserts.SoftAssert;
import PAGES.LoginP;


public class A2_LoginACTION {
    LoginP login=new LoginP();
    @Given("User at home page and click login Tab")
    public void LoginT() {

        login.loginTab().click();

    }
    @And("User enter his valid data")
    public void InputUserData()
    {

        login.EmaiLogin().sendKeys("kareemashraf@gmail.com");
        login.PasswordLogin().sendKeys("UDACITY_COURSE");

    }
    @And("User click log in button")
    public void loginButton() {
        login.LogBTN().click();

    }
    @And("Back to home page done")
    public void home_page()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(login.AccountT().isDisplayed(),true);
        soft.assertEquals(hook.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"),true);
        soft.assertAll();

    }

}
