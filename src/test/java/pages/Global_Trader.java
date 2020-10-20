package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Global_Trader {
    public Global_Trader(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(partialLinkText = "Seller Join N")
    public WebElement globalSellerJoinButton;

    @FindBy( xpath= "//label[contains(text(),'Company Seller')]")
    public WebElement CompanySeller;
    @FindBy(id = "company_name")
    public WebElement company_name;
    @FindBy(id = "company_mobile")
    public WebElement company_mobile;
    @FindBy(id = "company_address")
    public WebElement company_address;
    @FindBy(id = "vender_name")
    public WebElement vender_name;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "sub_domain")
    public WebElement sub_domain;
    @FindBy(id = "vender_mobile")
    public WebElement vender_mobile;
    @FindBy(name = "country")
    public WebElement country;

    @FindBy(id = "select_state")
    public WebElement select_state;
    @FindBy(id = "select_city")
    public WebElement select_city;
    @FindBy(id = "vender_address")
    public WebElement vender_address;
    @FindBy(id = "zip_code_input")
    public WebElement zip_code_input;
    @FindBy(name = "category")
    public WebElement category;


    @FindBy(id = "password")
    public WebElement password;
    @FindBy(name = "submit")
    public WebElement submit;
    @FindBy(xpath = "//p[contains(text(),'Thank you to join our team. You are Registered Suc')]")
    public WebElement message;












}
