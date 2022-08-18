package Step_definition;
import PAGES.RegisterP;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import PAGES.LoginP;
import PAGES.ShopCartP;
public class A14_CreateOrderAction {
    LoginP login=new LoginP();
    ShopCartP cart=new ShopCartP();
    @Given("User log in with valid email")
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
    @And("User click on Add items to Shopping cart")
    public void selectItems() throws InterruptedException
    {
        cart.AddItem(3).click();Thread.sleep(600);
        cart.AddItem(2).click();
        cart.AddItemsFromOwnPage().click();


    }
    @And("Navigate to shopping cart")
    public void shopping_cart()

    {
        cart.shoppingCartT().click();
    }
    @And("Agree with the terms of service")
    public void agreeWithTerms()
    {

        cart.TermServ().click();

    }
    @When("User click checkout button")
    public void checkoutButton()
    {

        cart.Checkout().click();

    }
    @And("User enter valid data to Billing address section")
    public void Billing_address()  {

        cart.Countryy().click();
        cart.Cityy().sendKeys("Alex");
        cart.Address("BillingNewAddress_Address1").sendKeys("Alexandria");
        cart.Address("BillingNewAddress_Address2").sendKeys("Alexandria");
        cart.postal_code().sendKeys("314529");
        cart.PhoneNumber().sendKeys("0123456789");
        cart.FaxNumber().sendKeys("11231");
        cart.ContinueBTN().click();

    }
    @And("User enter valid data to Shipping method section")
    public void Shipping_method()
    {

        cart.ShippingMTHD().click();
        cart.ContinueBTN1().click();

    }
    @And("User enter valid data to Payment method section")
    public void Payment_method()
    {

        cart.PaymentMTHD().click();
        cart.ContinueBTN2().click();

    }
    @And("Payment Information Section")
    public void Payment_information()
    {

        cart.ContinueBTN3().click();

    }
    @Then("User Confirm Order")
    public void confirm_order()
    {

        cart.Confirmation().click();

    }
    @And("The order done successful")
    public void order_done() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        Thread.sleep(1000);
        soft.assertTrue(hook.driver.findElement(By.tagName("strong")).getText().contains("Your order has been successfully processed!"));
        soft.assertEquals(hook.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/checkout/completed"),true);
        soft.assertAll();
        cart.ContinueBTN4().click();

    }

}
