package Step_definition;
import PAGES.WishLitstP;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import PAGES.LoginP;

public class A8_WishlistAction {
    LoginP login=new LoginP();
    WishLitstP wish =new WishLitstP();
    @Given("User login with his data")
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
    @And("User clicks on Add tap to Wishlist")
    public void Added_WishList() throws InterruptedException {
        wish.Add_item(3).click();Thread.sleep(900);
        wish.Add_item(2).click();
        wish.AddItem_OwnPage().click();

    }
    @And("success message is displayed")
    public void S_Message() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(hook.driver.findElement(By.className("content")).isDisplayed());
        soft.assertTrue(hook.driver.findElement(By.className("content")).getText().contains("The product has been added to your wishlist"));
        soft.assertAll();


    }
    @And("Add Done successful")
    public void AddedWishlist_Done()
    {
        wish.WishlistT().click();
        Assert.assertTrue(hook.driver.findElement(By.className("wishlist-content")).isDisplayed());

    }

}