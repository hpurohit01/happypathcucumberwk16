package com.form.jotform.pages;

import com.form.jotform.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmissionPage extends Utility {

    private static final Logger log = LogManager.getLogger(SubmissionPage.class.getName());

    public SubmissionPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(text(),'Your submission has been received!')]")
    WebElement submissionMessage;

    public String verifySubmission(){
        log.info("verifying submission: "+submissionMessage.getText());
        return submissionMessage.getText();
    }
}
