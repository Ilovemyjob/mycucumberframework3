package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Hotel_Room_Test;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelRoomCreation {

    Hotel_Room_Test hotel_room_test = new Hotel_Room_Test();

    @Given("user is on the kaolaMain page")
    public void user_is_on_the_kaola_main_page() {
        Driver.getDriver().get(ConfigReader.getProperty("kaola_url"));
    }

    @Given("user clicks on the kaolaMainLogin button")
    public void user_clicks_on_the_kaola_main_login_button() {
        hotel_room_test.kaolaMainLoginButton.click();

    }

    @Given("user sends username")
    public void user_sends_username() {
        hotel_room_test.kaolaUsername.sendKeys(ConfigReader.getProperty("username"));
    }

    @Given("user sends password")
    public void user_sends_password() {
        hotel_room_test.kaolaPass.sendKeys(ConfigReader.getProperty("password"));


    }

    @Given("user clicks on the kaolaLogin button")
    public void user_clicks_on_the_kaola_login_button() {
        hotel_room_test.kaolaLoginButton.click();

    }

    @Given("user clicks on the hotelManagement")
    public void user_clicks_on_the_hotel_management() {

        hotel_room_test.hotelManagement.click();

    }

    @Given("user clicks on the hotelRooms")
    public void user_clicks_on_the_hotel_rooms() {
        hotel_room_test.hotelRooms.click();
    }

    @Given("user clicks on the addHotelRoomButton")
    public void user_clicks_on_the_add_hotel_room_button() {
        hotel_room_test.addHotelRoomButton.click();
    }
    @Given("user select Hotel")
    public void user_select_hotel() {

       Select selectHotel = new Select(hotel_room_test.createHotelId);
       selectHotel.selectByIndex(1);
    }

    @Given("user sends code")
    public void user_sends_code() {
        hotel_room_test.createCode.sendKeys("12345");
    }

    @Given("user sends name")
    public void user_sends_name() {
        hotel_room_test.createName.sendKeys("alp");
    }

    @Given("user sends Location")
    public void user_sends_lacation() {
        hotel_room_test.createLocation.sendKeys("Germany");
    }

    @Given("user sends Description")
    public void user_sends_description() {
        hotel_room_test.createDescription.sendKeys("best hotel");
    }

    @Given("user sends price")
    public void user_sends_price() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        WebElement target = hotel_room_test.createTarget;
        WebElement source = hotel_room_test.createSource;
        actions.dragAndDrop(source,target).perform();
        Thread.sleep(4000);


    }

    @Given("user chooses room type")
    public void user_chooses_room_type() {
        Select option = new Select(hotel_room_test.createRoomType);
        option.selectByIndex(1);
    }

    @Given("user sends maxAdultCount")
    public void user_sends_max_adult_count() {
        hotel_room_test.createMaxAdultCount.sendKeys("2");
    }

    @Given("user sends maxChildrenCount")
    public void user_sends_max_children_count() {
    hotel_room_test.createMaxChildCount.sendKeys("2");

    }

    @Given("user clicks Approved")
    public void user_clicks_approved() {
        hotel_room_test.createIsAvailable.click();
    }

    @Given("user clicks save button")
    public void user_clicks_save_button() throws InterruptedException {
        hotel_room_test.createbtnSubmit.click();
        Thread.sleep(2000);
    }

    @Given("user see successMessage")
    public void user_see_success_message() {
       String actual= hotel_room_test.createSuccessMessage.getText();
        Assert.assertEquals(actual,"HotelRoom was inserted successfully");
    }

    @Then("user clicks ok button")
    public void user_clicks_ok_button() {
        hotel_room_test.createOkButton.click();

    }
}
