package Step_definition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import PAGES.LoginP;
import PAGES.HomeP;

public class A9_CompareLAction {
    HomeP home=new HomeP(hook.driver);
    LoginP login=new LoginP();
    @Given("User log-in with his valid information")
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
    @And("User click on Add to compare-list")
    public void AddToComparelist() throws InterruptedException {
        home.Add_To_Comparelist(1).click();Thread.sleep(500);
        home.Add_To_Comparelist(2).click();Thread.sleep(500);
        home.Add_To_Comparelist(3).click();Thread.sleep(500);
        home.Add_To_Comparelist(4).click();Thread.sleep(500);
    }
    @And("Add to compare list done successful")
    public void Add_to_compare_done() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(hook.driver.findElement(By.className("content")).isDisplayed());
        soft.assertTrue(hook.driver.findElement(By.className("content")).getText().contains("The product has been added to your product comparison"));
        soft.assertAll();
        home.CompareProducts().click();
        Assert.assertTrue(hook.driver.findElement(By.className("compare-products-table")).isDisplayed());
    }

}
