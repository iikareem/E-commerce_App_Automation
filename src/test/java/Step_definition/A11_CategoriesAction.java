package Step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import PAGES.LoginP;
import PAGES.HomeP;

public class A11_CategoriesAction {
    HomeP home=new HomeP(hook.driver);
    LoginP login=new LoginP();
    @Given("User has login with his valid email and pass")
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
    @And("Select the Category")
    public void selectCategory() {

        home.SelectCategory().click();
    }
    @And("Open the sub-Category")
    public void subCategory() {

        home.SCategoryTab().click();
    }
    @And("Open page done successful")
    public void openSubCategory()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(hook.driver.findElement(By.linkText("Shoes")).isDisplayed());
        soft.assertEquals(hook.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/shoes"),true);
        soft.assertAll();

    }

}
