package Step_definition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.asserts.SoftAssert;
import PAGES.LoginP;
import PAGES.HomeP;

public class A4_SearchAction {
    HomeP home=new HomeP(hook.driver);
    LoginP login=new LoginP();
    @Given("Log in successful")
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
    @And("User enter any product in search field")
    public void search()
    {

        home.Search().sendKeys("Mobile");

    }
    @And("User click on search button")
    public void searchButton()
    {

        home.SearchBTN().click();

    }
    @And("Search has done successful")
    public void search_done()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(home.SearchP().isDisplayed(),true);
        soft.assertEquals(hook.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=Mobile"),true);
        soft.assertAll();


    }




}
