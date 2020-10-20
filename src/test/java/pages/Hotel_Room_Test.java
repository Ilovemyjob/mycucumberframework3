package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hotel_Room_Test {
    public Hotel_Room_Test(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(linkText = "Log in")
    public WebElement kaolaMainLoginButton;

    @FindBy(id="UserName")
    public WebElement kaolaUsername;
    @FindBy(id="Password")
    public WebElement kaolaPass;
    @FindBy(id="btnSubmit")
    public WebElement kaolaLoginButton;

    @FindBy(linkText = "Hotel Management")
    public WebElement hotelManagement;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRooms;
    @FindBy(partialLinkText = "ADD HOTELROOM")
    public WebElement addHotelRoomButton;
    @FindBy(id="IDHotel")
    public WebElement createHotelId;

    @FindBy(id="Code")
    public WebElement createCode;
    @FindBy(id="Name")
    public WebElement createName;
    @FindBy(id="Location")
    public WebElement createLocation;
    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement createDescription;

    @FindBy(xpath = "//li[@data-id='700']")
    public WebElement createSource;
    @FindBy(id="Price")
    public WebElement createTarget;

    @FindBy(id="IDGroupRoomType")
    public WebElement createRoomType;

    @FindBy(id="MaxAdultCount")
    public WebElement createMaxAdultCount;

    @FindBy(id="MaxChildCount")
    public WebElement createMaxChildCount;

    @FindBy(id="IsAvailable")
    public WebElement createIsAvailable;

    @FindBy(id="btnSubmit")
    public WebElement createbtnSubmit;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement createSuccessMessage;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement createOkButton;

    @FindBy(xpath = "(//a/i[@class='icon-calendar'])[3]")
    public WebElement createHotelAdminRoom;




}
