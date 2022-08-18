package Step_definition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import PAGES.LoginP;
import PAGES.HomeP;
import PAGES.ShopCartP;

public class A10_ShopCartAction {
    ShopCartP Cart=new ShopCartP();
    LoginP login=new LoginP();
    @Given("User has login with his valid email and password")
    public void Login() {
        login.loginTab().click();
        login.EmaiLogin().sendKeys("kareemashraf@gmail.com");
        login.PasswordLogin().sendKeys("UDACITY_COURSE");
        login.LogBTN().click();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(login.AccountT().isDisplayed(),true);
        soft.assertEquals(hook.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"),true);
        soft.assertAll();
    }
    @And("User clicks on Add to Shopping cart")
    public void AddToShoppingCart() throws InterruptedException {
        Cart.AddItem(3).click();Thread.sleep(900);
        Cart.AddItem(2).click();
        Cart.AddItemsFromOwnPage().click();

    }
    @And("Add ToShopping cart done successful")
    public void Add_to_Shopping_cart() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(hook.driver.findElement(By.className("content")).isDisplayed());
        soft.assertTrue(hook.driver.findElement(By.className("content")).getText().contains("The product has been added to your shopping cart"));
        soft.assertAll();
        Cart.shoppingCartT().click();
        Assert.assertTrue(hook.driver.findElement(By.className("cart")).isDisplayed());
    }
}
