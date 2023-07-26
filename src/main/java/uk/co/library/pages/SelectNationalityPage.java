package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectNationality(String nationality)
    {
        //Select a Nationality 'Australia'
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
        log.info("select the nationality "+ nationalityDropDownList.toString());
    }
    public void clickNextStepButton()
    {
        //Click on Continue button
        clickOnElement(nextStepButton);
        log.info("click On next step button "+ nextStepButton.toString());
    }
}