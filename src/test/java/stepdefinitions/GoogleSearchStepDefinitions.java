package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.DataTablePage;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchStepDefinitions {

    GooglePage googlePage=new GooglePage();
    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        Driver.getDriver().findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Given("user search for iphone")
    public void user_search_for_iphone() {
        googlePage.searchBox.sendKeys("iphone"+Keys.ENTER);
//        googlePage.searchBox.submit();
    }
    @Then("verify the result has iphone")
    public void verify_the_result_has_iphone() {
        String pageTitle=Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(pageTitle.contains("iphone"));
    }
    @Given("user search for tea pot")
    public void user_search_for_tea_pot() {
        googlePage.searchBox.sendKeys("tea pot"+Keys.ENTER);
    }
    @Then("verify the result has tea pot")
    public void verify_the_result_has_tea_pot() {
        String pageTitle=Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(pageTitle.contains("tea pot"));
    }
    @Given("user search for flower")
    public void user_search_for_flower() {
        googlePage.searchBox.sendKeys("flower"+Keys.ENTER);
    }
    @Then("verify the result has flower")
    public void verify_the_result_has_flower() {
        String pageTitle=Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(pageTitle.contains("flower"));
    }
    @Given("user search for {string}")
    public void user_search_for(String string) {
        googlePage.searchBox.sendKeys(string+Keys.ENTER);
    }
    @Then("verify the result has {string}")
    public void verify_the_result_has(String string) {
        String pageTitle=Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(pageTitle.contains(string));
      //  Assert.fail();// we do on purpose fail
    }
}