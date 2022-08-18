package Step_definition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import PAGES.LoginP;

public class A13_TagsStepAction {
    LoginP login=new LoginP();
    @Given("user log and navigate to home page")
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
    @And("navigate to All product tags")
    public void All_product_tags() {
        hook.driver.navigate().to("https://demo.nopcommerce.com/producttag/all");

    }
    @And("user select any tag like apparel")
    public void select_tag() {
        hook.driver.findElement(By.cssSelector("a[href=\"/apparel-2\"] ")).click();


    }
    @And("Products tagged with 'apparel' appears")
    public void select_done() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(hook.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/apparel-2"),true);
        Assert.assertTrue(hook.driver.findElement(By.tagName("h1")).getText().contains("Products tagged with 'apparel'"));
        soft.assertAll();

    }

}
