package Step_definition;
import io.cucumber.java.en.Given;
import PAGES.HomeP;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class A6_FollowUs {
    HomeP Home =new HomeP(hook.driver);

    @Given("user opens facebook link")
    public void opensFaceL() {
        HomeP.Facebook().click();
        hook.NavigationTabs(1, 2);
    }

    @Given("user opens twitter link")
    public void opensTwitterL() {
        HomeP.Twitter().click();
        hook.NavigationTabs(1, 2);
    }

    @Given("user opens rss link")
    public void opensNewsL() {
        HomeP.News().click();
        hook.NavigationTabs(0, 1);
    }

    @Given("user opens youtube link")
    public void opensYTBL() {
        HomeP.Youtube().click();
        hook.NavigationTabs(1, 2);
    }

    @Then("{string} is opened" )
    public void isOpenedInNewTab(String link) {
        Assert.assertEquals(hook.driver.getCurrentUrl(), link);
    }










}
