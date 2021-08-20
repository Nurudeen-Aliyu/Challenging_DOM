package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.WebDriverHelpers;

import java.util.List;

//"extend" calls/inherit the WebDriver inside the WebDriverHelpers
public class ChallengingDOM extends WebDriverHelpers {

    //Defines the WebDriver class to be used here
    private WebDriverHelpers webDriver;


    //STEPS\ LOCATORS
    private By pageTitle = By.xpath("//title[contains(text(),'The Internet')]");
    private By pageHeader = By.xpath("//div[@class=\"example\"]/h3");
    private By BlueButton = By.xpath("//div[@class='large-2 columns']/a[1]");
    private By RedButton = By.xpath("//div[@class='large-2 columns']/a[2]");
    private By GreenButton = By.xpath("//div[@class='large-2 columns']/a[3]");
    private By editFirstRow = By.xpath("//tr[1]/td[7]/a[1]");
    private By deleteSixthRow = By.xpath("//tr[6]/td[7]/a[2]");
    private By clickFooterLink = By.xpath("//*[@id=\"page-footer\"]/div/div/a");
    private By displayCanvas = By.id("canvas");
    private By tableRows = By.xpath("//tbody/tr");




    //constructor to link the driver
    public ChallengingDOM(WebDriverHelpers webDriver){
        this.webDriver = webDriver;
    }

// ==========================================================================

    // === METHODS DEFINING THE STEPS ===


    //TEST 01
    public String currentPageTitle() {
        return webDriver.driver.getTitle();
    }


    //TEST 02
    public String pageHeaderTitle() {
        return webDriver.driver.findElement(pageHeader).getText();
    }


    //TEST 03
    public boolean clickOnBlueButton(){
        boolean Blue_Button = webDriver.driver.findElement(BlueButton).isEnabled();
        return Blue_Button;
    }


    //TEST 04
    public boolean clickOnRedButton(){
        boolean Red_Button = webDriver.driver.findElement(RedButton).isEnabled();
        return Red_Button;
    }


    //TEST 05
    public boolean clickOnGreenButton(){
        boolean Green_Button = webDriver.driver.findElement(GreenButton).isEnabled();
        return Green_Button;
    }


    //TEST 06
    public void clickOnFirstRowEditLink(){
        webDriver.driver.findElement(editFirstRow).click();
    }


    //TEST 07
    public void clickDeleteLinkOnSixthRow() {
        webDriver.driver.findElement(deleteSixthRow).click();
    }


    //TEST 08
    public void clickOnFooterLink() {
        webDriver.driver.findElement(clickFooterLink).click();
    }

    public String currentURL() {
        return webDriver.driver.getCurrentUrl();
    }

    //TEST 09
    public boolean canvasIsDisplayed() {
     webDriver.driver.findElement(displayCanvas).isDisplayed();
        return true;
    }

    //TEST 10
    public void tableRowsAreTen() {
      List<WebElement> tr = webDriver.driver.findElements(tableRows);
      int count = tr.size();
        Assert.assertEquals(count, 10);
    }

}
