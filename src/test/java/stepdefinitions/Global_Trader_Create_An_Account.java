package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.Global_Trader;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class Global_Trader_Create_An_Account {

    Global_Trader global_trader = new Global_Trader();

    @Given("user is on the global trader page")
    public void user_is_on_the_global_trader_page() {
        Driver.getDriver().get(ConfigReader.getProperty("global"));
    }

    @Given("user click on Seller Join Now  Button")
    public void user_click_on_Seller_Join_Now_Button() {
        global_trader.globalSellerJoinButton.click();
    }

    @Given("user click on Company Seller box")
    public void user_click_on_Company_Seller_box() {
        global_trader.CompanySeller.click();
    }

    @Given("user type a Company Name")
    public void user_type_a_Company_Name() {
        global_trader.company_name.sendKeys("ziya");

    }

    @Given("user type a Company Mobile")
    public void user_type_a_Company_Mobile() {
        global_trader.company_mobile.sendKeys("1234567891");
    }



    @Given("user type an Company Address")
    public void user_type_an_Company_Address() {
        global_trader.company_address.sendKeys("cumhuriyet");
    }

    @Given("user type a Name")
    public void user_type_a_Name() {
        global_trader.vender_name.sendKeys("star");
    }

    @Given("user type an Email")
    public void user_type_an_Email() {
        global_trader.email.sendKeys("atabal@gmail.com");
    }

    @Given("user type a Sub Domain")
    public void user_type_a_Sub_Domain() {
        global_trader.sub_domain.sendKeys("123456");
    }

    @Given("user type a Mobile Number")
    public void user_type_a_Mobile_Number() {
        global_trader.vender_mobile.sendKeys("1234567893");

    }

    @Given("user choose a Country")
    public void user_choose_a_Country() {
        Select options = new Select(global_trader.country);
        options.selectByIndex(1);
    }

    @Given("user type a State")
    public void user_type_a_State() {
        global_trader.select_state.sendKeys("germany");
    }



    @Given("user type a City")
    public void user_type_a_City() {
        global_trader.select_city.sendKeys("frankfurt");
    }

    @Given("user type an Address")
    public void user_type_an_Address() {
        global_trader.vender_address.sendKeys("frankfurt");
    }

    @Given("user type an Postal Code")
    public void user_type_an_Postal_Code() {
        global_trader.zip_code_input.sendKeys("12345");

    }

    @Given("user choose a Categories")
    public void user_choose_a_Categories() {
     Select options = new Select(global_trader.category);
     options.selectByIndex(1);
    }

    @Given("user type a Password")
    public void user_type_a_Password() {
       global_trader.password.sendKeys("12345");
    }



    @Given("user click on Registration Box")
    public void user_click_on_Registration_Box() {
       global_trader.submit.click();
    }

    @Given("user get message\"Thank you to join our team. You are Registered Successfully.\"")
    public void user_get_message_Thank_you_to_join_our_team_You_are_Registered_Successfully() {

        String actual =global_trader.message.getText();
        Assert.assertEquals("Thank you to join our team. You are Registered Successfully.",actual);

    }

    @Given("user type a Company Name {string}")
    public void user_type_a_Company_Name(String string) {
       global_trader.company_name.sendKeys(string);
    }

    @Given("user type a Company  Mobile {string}")
    public void user_type_a_Company_Mobile(String string) {
        global_trader.company_mobile.sendKeys(string);
    }

    @Given("user type an Company Address {string}")
    public void user_type_an_Company_Address(String string) {
       global_trader.company_address.sendKeys(string);
    }

    @Given("user type a Name {string}")
    public void user_type_a_Name(String string) {
        global_trader.vender_name.sendKeys(string);
    }

    @Given("user type an Email {string}")
    public void user_type_an_Email(String string) {
        global_trader.email.sendKeys(string);
    }

    @Given("user type a Sub Domain {string}")
    public void user_type_a_Sub_Domain(String string) {
      global_trader.sub_domain.sendKeys(string);
    }

    @Given("user type a Mobile Number {string}")
    public void user_type_a_Mobile_Number(String string) {
       global_trader.vender_mobile.sendKeys(string);
    }

    @Given("user type a State {string}")
    public void user_type_a_State(String string) {
       global_trader.select_state.sendKeys(string);
    }

    @Given("user type a City {string}")
    public void user_type_a_City(String string) {
       global_trader.select_city.sendKeys(string);
    }

    @Given("user type an Address {string}")
    public void user_type_an_Address(String string) {
       global_trader.vender_address.sendKeys(string);
    }

    @Given("user type an Postal Code {string}")
    public void user_type_an_Postal_Code(String string) {
     global_trader.zip_code_input.sendKeys(string);
    }

    @Given("user type a Password {string}")
    public void user_type_a_Password(String string) {
      global_trader.password.sendKeys(string);
    }






}
