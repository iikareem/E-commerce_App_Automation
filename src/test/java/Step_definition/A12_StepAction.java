package Step_definition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import PAGES.LoginP;
import PAGES.HomeP;

public class A12_StepAction {
    HomeP home=new HomeP(hook.driver);
    LoginP login=new LoginP();
    @Given("user log in with valid email and password")
    public void login() {
        login.loginTab().click();
        login.EmaiLogin().sendKeys("kareemashraf@gmail.com");
        login.PasswordLogin().sendKeys("UDACITY_COURSE");
        login.LogBTN().click();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(login.AccountT().isDisplayed(),true);
        soft.assertEquals(hook.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"),true);
        soft.assertAll();
    }
    @And("select specific category like Apparel > Shoes")
    public void select_specific_category()  {
        home.SelectCategory().click();
        home.SCategoryTab().click();

    }
    @And("select color")
    public void select_color() {
        home.SelectColor().click();
    }
    @And("select color done successfully")
    public void select_color_done() {
        Assert.assertEquals(hook.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15"),true);
    }

}
