package PAGES;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Step_definition.hook;

public class LoginP {
    public WebElement loginTab ()
    {
        return hook.driver.findElement(By.className("ico-login"));
    }
    public WebElement EmaiLogin ()
    {
        return hook.driver.findElement(By.id("Email"));
    }
    public WebElement PasswordLogin ()
    {
        return hook.driver.findElement(By.id("Password"));
    }
    public WebElement LogBTN ()
    {
        return hook.driver.findElement(By.cssSelector("div[class=\"buttons\"] > button[type=\"submit\"]"));
    }
    public WebElement AccountT ()
    {
        return hook.driver.findElement(By.className("ico-account"));
    }
}