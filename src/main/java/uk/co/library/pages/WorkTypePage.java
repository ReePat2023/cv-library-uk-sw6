package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    public WorkTypePage(){
        PageFactory.initElements(driver,this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "")
    WebElement selectJobTypeList;


    public void selectJobType(String job) {
        log.info(" Enter jobTitle" + job);
        clickOnElement(By.xpath("//label[contains(normalize-space(),'" + job + "')]//parent::*//input"));
    }

    public void clickNextStepButton() {
        log.info("click Next StepButton " + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }
}
