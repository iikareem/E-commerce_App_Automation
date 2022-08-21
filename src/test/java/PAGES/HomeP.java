package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Step_definition.hook;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class HomeP {
    WebDriver Wdriver = null;

    public HomeP(WebDriver driver) {
        this.Wdriver = driver;
        PageFactory.initElements(driver, this);
    }


    public WebElement CurrencieToEuro() {

        return hook.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"] > option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
    }
    public WebElement CurrencieToUs() {

        return hook.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"] > option[value=\"https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F\"]"));
    }

    public WebElement Search() {
        return hook.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement SearchBTN() {
        return hook.driver.findElement(By.className("search-box-button"));
    }

    public WebElement SearchP() {

        return hook.driver.findElement(By.className("page-body"));
    }

    public WebElement Add_To_Comparelist(int itemNum) {

        return hook.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-compare-list-button\"])[" + itemNum + "]"));
    }

    public WebElement CompareProducts() {

        return hook.driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));
    }

    public WebElement SelectCategory() {

        return hook.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
    }

    public WebElement SCategoryTab() {

        return hook.driver.findElement(By.cssSelector("img[alt=\"Picture for category Shoes\"]"));
    }
    public WebElement SelectColor ()
    {

        return hook.driver.findElement(By.cssSelector("input[data-option-id=\"15\"]"));
    }
    public static WebElement Facebook()
    {

        return hook.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }
    public static WebElement Twitter()
    {

        return hook.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }
    public static WebElement News()
    {

        return hook.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }
    public static WebElement Youtube()
    {

        return hook.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }

    @FindBy(css = "div.nivoSlider")
    public WebElement Slider_POM;
    @FindBy(css = "a.nivo-control")
    public List<WebElement> Slider_SCR_POM;

    public static void SelectCurrency() throws InterruptedException {
        WebElement euro = hook.driver.findElement(By.name("customerCurrency"));
        Select SelectC = new Select(euro);
        Thread.sleep(3000);
        SelectC.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F"); }


    @FindBy(css = "span.price")
    public static List<WebElement> ProductPC;

    public static void ProductsInEuro() {


        String EuroS = "€";
        List<WebElement> productsPrices = ProductPC;
        for (WebElement price : productsPrices) {
            Assert.assertTrue(price.getText().contains(EuroS));
        }
    }






}