package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Step_definition.hook;


public class ShopCartP {
    public WebElement AddItem (int itemNum)
    {

        return hook.driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])["+itemNum+"]"));
    }
    public WebElement AddItemsFromOwnPage ()
    {

        return hook.driver.findElement(By.id("add-to-cart-button-4"));

    }
    public WebElement shoppingCartT ()
    {

        return hook.driver.findElement(By.cssSelector("a[href=\"/cart\"]"));
    }
    public WebElement TermServ ()
    {

        return hook.driver.findElement(By.id("termsofservice"));
    }
    public WebElement Checkout ()
    {

        return hook.driver.findElement(By.id("checkout"));
    }
    public WebElement Countryy ()
    {

        return hook.driver.findElement(By.cssSelector("select[id=\"BillingNewAddress_CountryId\"] > option[value=\"123\"]"));
    }
    public WebElement Cityy ()
    {

        return hook.driver.findElement(By.id("BillingNewAddress_City"));
    }
    public WebElement Address (String id)
    {

        return hook.driver.findElement(By.id(id));
    }
    public WebElement postal_code ()
    {

        return hook.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }
    public WebElement PhoneNumber ()
    {

        return hook.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }
    public WebElement FaxNumber ()
    {

        return hook.driver.findElement(By.id("BillingNewAddress_FaxNumber"));
    }
    public WebElement ContinueBTN ()
    {

        return hook.driver.findElement(By.className("new-address-next-step-button"));
    }
    public WebElement ShippingMTHD ()
    {

        return hook.driver.findElement(By.id("shippingoption_0"));
    }
    public WebElement PaymentMTHD ()
    {

        return hook.driver.findElement(By.id("paymentmethod_0"));
    }
    public WebElement Confirmation ()
    {

        return hook.driver.findElement(By.className("confirm-order-next-step-button"));
    }
    public WebElement ContinueBTN1 ()
    {

        return hook.driver.findElement(By.className("shipping-method-next-step-button"));
    }
    public WebElement ContinueBTN2 ()
    {

        return hook.driver.findElement(By.className("payment-method-next-step-button"));
    }
    public WebElement ContinueBTN3 ()
    {

        return hook.driver.findElement(By.className("payment-info-next-step-button"));
    }
    public WebElement ContinueBTN4()
    {

        return hook.driver.findElement(By.className("order-completed-continue-button"));
    }
}
