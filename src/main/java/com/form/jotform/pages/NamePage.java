package com.form.jotform.pages;

import com.form.jotform.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NamePage extends Utility {
    private static final Logger log = LogManager.getLogger(NamePage.class.getName());

    public NamePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "div[data-type='control_fullname'] button[aria-label='Next']")
    WebElement nextButton;

    @FindBy(xpath = "//div[@class='jfField']//input[@id='first_3']")
    WebElement firstNameField;

    @FindBy(xpath = "//div[@class='jfField']//input[@id='last_3']")
    WebElement lastNameField;

    public void enterFirstName(String firstName) {
        clickOnElement(firstNameField);
        log.info("Entering first name: "+ firstName);
    }

    public void enterLastName(String lastName) {
        clickOnElement(lastNameField);
        log.info("Entering last name: "+lastName);
    }

    public void clickOnNextButton() {
        clickOnElement(nextButton);
        log.info("Clicking on next button. "+nextButton.toString());
    }
}

