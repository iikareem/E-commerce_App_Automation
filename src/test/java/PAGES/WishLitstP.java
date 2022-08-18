package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Step_definition.hook;


public class WishLitstP {
    public WebElement Add_item (int itemNum)
    {

        return hook.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])["+itemNum+"]"));
    }
    public WebElement AddItem_OwnPage ()
    {

        return hook.driver.findElement(By.id("add-to-wishlist-button-4"));

    }
    public WebElement WishlistT ()
    {

        return hook.driver.findElement(By.cssSelector("a[href=\"/wishlist\"]"));
    }
}
