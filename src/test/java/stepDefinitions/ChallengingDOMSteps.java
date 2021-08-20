package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ChallengingDOM;
import utilities.WebDriverHelpers;

import java.util.List;

public class ChallengingDOMSteps {

    //Links the WebDriverHelpers class
    private WebDriverHelpers webDriverHelpers;

    //Links the SignupPage class
    private ChallengingDOM challengingDOM;


    //Constructor
    public ChallengingDOMSteps(WebDriverHelpers driverHelpers) {
        this.webDriverHelpers = driverHelpers;
        this.challengingDOM = new ChallengingDOM(webDriverHelpers);
    }


    //TEST 01
    @Given("that the Web Application is loaded on a browser")
    public void thatTheWebApplicationIsLoadedOnABrowser() {
        webDriverHelpers.driver.get("https://the-internet.herokuapp.com/challenging_dom");
    }

    @Then("the page title should be The Internet")
        public void thePageTitleShouldBeTheInternet() {
            String CurrentPageTitle = challengingDOM.currentPageTitle();
            Assert.assertEquals("The Internet", CurrentPageTitle);
    }


    //TEST 02
    @Then("the page Header Title should be Challenging DOM")
        public void thePageHeaderTitleShouldBeChallengingDOM() {
            String PageHeaderTitle = challengingDOM.pageHeaderTitle();
            Assert.assertEquals("Challenging DOM", PageHeaderTitle);
    }


    //TEST 03
    @When("a user navigate to the blue button and click")
        public void aUserNavigateToTheBlueButtonAndClick() {
        challengingDOM.clickOnBlueButton();
    }

    @Then("the Blue Button should be active")
        public void theBlueButtonIDAttributeShouldChangeAfterClick() {
            Assert.assertTrue(challengingDOM.clickOnBlueButton());
    }


    //TEST 04
    @When("a user navigate to the red button and click")
        public void aUserNavigateToTheRedButtonAndClick() {
        challengingDOM.clickOnRedButton();
    }

    @Then("the Red Button should be active")
        public void theRedButtonIDAttributeShouldChangeAfterClick() {
        Assert.assertTrue(challengingDOM.clickOnRedButton());
    }


    //TEST 05
    @When("a user navigate to the green button and click")
        public void aUserNavigateToTheGreenButtonAndClick() {
        challengingDOM.clickOnGreenButton();
    }

    @Then("the Green Button should be active")
        public void theGreenButtonIDAttributeShouldChangeAfterClick() {
        Assert.assertTrue(challengingDOM.clickOnGreenButton());
    }


    //TEST 06
    @When("a user navigate to the edit link on the first table row and click")
        public void aUserNavigateToTheEditLinkOnTheFirstTableRowAndClick() {
        challengingDOM.clickOnFirstRowEditLink();
    }

    @Then("the first row should be edited")
        public void theFirstRowShouldBeEdited() {
    }


    //TEST 07
    @When("a user navigate to delete link on the table's second row and click")
        public void aUserNavigateToDeleteLinkOnTheTableSSecondRowAndClick() {
        challengingDOM.clickDeleteLinkOnSixthRow();
    }

    @Then("the sixth row should be deleted")
        public void theSixthRowShouldBeDeleted() {
    }


    //TEST 08
    @When("a user navigate to the footer and click on Elemental Selenium link")
        public void aUserNavigateToTheFooterAndClickOnElementalSeleniumLink() {
        challengingDOM.clickOnFooterLink();
    }

    @Then("the user should be redirected to Elemental Selenium page")
        public void theUserShouldBeRedirectedToElementalSeleniumPage() {
           String FooterLink = challengingDOM.currentPageTitle();
           Assert.assertEquals("http://elementalselenium.com/", FooterLink);
    }


    //TEST 09
    @Then("a canvas element should be displayed on the web page")
    public void aCanvasElementShouldBeDisplayedOnTheWebPage() {
        Assert.assertTrue(challengingDOM.canvasIsDisplayed());

    }

    //TEST 10
    @Then("the table rows on the web page should be ten")
    public void theTableRowsOnTheWebPageShouldBeTen() {
        challengingDOM.tableRowsAreTen();
    }

}
