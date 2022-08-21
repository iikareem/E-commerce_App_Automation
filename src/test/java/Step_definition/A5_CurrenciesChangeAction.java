package Step_definition;
import PAGES.LoginP;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import PAGES.HomeP;
import PAGES.LoginP;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;


public class A5_CurrenciesChangeAction {

    HomeP Home =new HomeP(hook.driver);
    LoginP login=new LoginP();
    @Given("user log and Navigate to Home")
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
    @When("User select euro currency")
    public void user_select_euro_currency() throws InterruptedException {HomeP.SelectCurrency();}

    @Then("products prices should be in €")
    public void Check_product_Symbol() {
        HomeP.ProductsInEuro();
    }


}