package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public StartPage(){
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Hide this message')]")
    WebElement hideMessage;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;
    public void acceptCookies()
    {
        //click On accept cookie button
        clickOnElement(acceptCookies);
        log.info("click on accept cookies button"+ acceptCookies.toString());
    }
    public void clickHideMessage()
    {
        //click on hide button
        clickOnElement(hideMessage);
        log.info("click on hide message button"+ hideMessage.toString());
    }
    public void clickStartNow()
    {
        //Click on start button
        clickOnElement(startNowButton);
        log.info("click on start now button"+ startNowButton.toString());
    }

}