package Step_definition;

import PAGES.HomeP;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class A7_SliderAction {
    HomeP homePage = new HomeP(hook.driver);
    SoftAssert SA = new SoftAssert();;

    @Given("User clicks on Nokia Lumia 1020 slider")
    public void userClicksOnNokiaLumiaSlider() throws InterruptedException {
        homePage.Slider_SCR_POM.get(0).click();
        homePage.Slider_POM.click();
        Thread.sleep(4000);
    }

    @Then("User should be Navigated to Nokia Lumia 1020 page")
    public void NokiaLumiaPage() {
        String ExpectedLink = "https://demo.nopcommerce.com/nokia-lumia-1020";

        SA.assertEquals(ExpectedLink,
                hook.driver.getCurrentUrl(),
                "The expected url : ".concat(ExpectedLink).concat("and the actual url is : ").concat(hook.driver.getCurrentUrl()));
        SA.assertTrue(hook.driver.findElement(By.linkText("My account")).isDisplayed(), "Element with \"My account\" did not displayed");
        SA.assertAll();
    }

    @Given("User clicks on iphone 6 slider")
    public void IphonePage() throws InterruptedException {
        homePage.Slider_SCR_POM.get(1).click();
        Thread.sleep(2000);
        homePage.Slider_POM.click();
        Thread.sleep(4000);
    }

    @Then("User should be Navigated to iphone 6 page")
    public void ToIphone6_Page() {
        String ExpectedLINK = "https://demo.nopcommerce.com/iphone-6";

        SA.assertEquals(ExpectedLINK,
                hook.driver.getCurrentUrl(),
                "The expected url : ".concat(ExpectedLINK).concat("and the actual url is : ").concat(hook.driver.getCurrentUrl()));
        SA.assertTrue(hook.driver.findElement(By.linkText("My account")).isDisplayed(), "Element With \"My account\" Didn't Displayed !! ");
        SA.assertAll();
    }
}
