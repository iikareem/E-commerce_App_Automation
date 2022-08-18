package Step_definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class hook {

    public static String Chromepath=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
    public static WebDriver driver;

    @Before
    public static void openCHROME() {
        System.setProperty("webdriver.chrome.driver",Chromepath);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com"); }

    public static void NavigationTabs(int TabIndx, int OpenedTabs) {
        WebDriverWait W = new WebDriverWait(driver, Duration.ofSeconds(7));
        W.until(ExpectedConditions.numberOfWindowsToBe(OpenedTabs));

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(Tabs.size());

        driver.switchTo().window(Tabs.get(TabIndx));
    }

    @After
    public static void closeCHROME()
    {
        driver.quit();
    }


}

