//package stepdefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.apache.hc.core5.util.Asserts;
//import org.junit.Assert;
//import org.openqa.selenium.Keys;
//import pages.GooglePage;
//import utilities.ConfigReader;
//import utilities.Driver;
//
//public class deneme {
//
//    GooglePage googlePage = new GooglePage();
//    @Given("user is on the google page")
//    public void user_is_on_the_google_page() {
//        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
//
//    }
//    @Given("user search for iphone")
//    public void user_search_for_iphone() {
//        googlePage.searchBox.sendKeys("iphone"+Keys.ENTER);
//
//
//
//    }
//    @Then("verify the result has iphone")
//    public void verify_the_result_has_iphone() {
//        String actual=Driver.getDriver().getTitle().toLowerCase();
//        Assert.assertTrue(actual.contains("iphone"));
//    }
//}
