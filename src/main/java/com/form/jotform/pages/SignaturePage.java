package com.form.jotform.pages;

import com.form.jotform.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignaturePage extends Utility {

    private static final Logger log = LogManager.getLogger(SignaturePage.class.getName());

    public SignaturePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@data-type='control_signature']//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement nextButton;

    @FindBy(xpath = "//canvas[@aria-label='E-Signature Field']")
    WebElement signatureField;

    @FindBy(css = "#signature_pad_7")
    WebElement canvasElement;

    public void signaturePerform() {

        Actions builder = new Actions(driver);
        Action signature = builder.moveToElement(canvasElement)
                .clickAndHold()
                .moveToElement(canvasElement, 20, 50)
                .moveByOffset(-50, -30)
                .moveByOffset(-80, -50)
                .moveByOffset(100, 50)
                .moveByOffset(-30, -90)
                .moveByOffset(-30, 90)
                .release(canvasElement)
                .build();
        signature.perform();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Performing signature.");
    }

    public void clickOnNextButton() {
        clickOnElement(nextButton);
        log.info("Clicking on next button. "+nextButton.getText());
    }

}
