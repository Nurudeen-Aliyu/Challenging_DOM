package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.WebDriverHelpers;

import java.util.concurrent.TimeUnit;

public class Hooks extends WebDriverHelpers {

    //This defines the WebDriverHelpers class to be used here. (Like a data member thing)
    private WebDriverHelpers webDriverHelpers;

    /*Dependency injection added, to make it easier to interact with objects or other classes)
      With this, the driver can be used anywhere in the classes (just for flexibility) */

    //CONSTRUCTOR
    public Hooks(WebDriverHelpers driverHelpers){
        this.webDriverHelpers = driverHelpers;
    }


    //INITIALISES THE BROWSER
    @Before
    public void launchBrowser(){

        //Allows you to locate the chromedriver in a more dynamic way
        String path = System.getProperty("user.dir"); //to get user directory
        System.setProperty("webdriver.chrome.driver", path + "/tools/chromedriver.exe"); //gets the chromedriver

        //An instance of chrome driver (Calls the Chrome driver)
        webDriverHelpers.driver = new ChromeDriver();

        webDriverHelpers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriverHelpers.driver.manage().window().maximize();

    }

    //SHUTDOWN THE BROWSER
    @After
    public void exitBrowser(){
        webDriverHelpers.driver.quit();
    }

}
