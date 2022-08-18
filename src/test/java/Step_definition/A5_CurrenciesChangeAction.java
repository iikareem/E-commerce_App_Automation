package Step_definition;
import PAGES.LoginP;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import PAGES.HomeP;
import PAGES.LoginP;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;


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
    @Then("user can find euro currency € displayed in Home Page")
    public void user_can_find_euro_symbol(){HomeP.currencyS();}


}
