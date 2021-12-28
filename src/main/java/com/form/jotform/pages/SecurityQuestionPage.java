package com.form.jotform.pages;

import com.form.jotform.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurityQuestionPage extends Utility {

    private static final Logger log = LogManager.getLogger(SecurityQuestionPage.class.getName());

    public SecurityQuestionPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//select[@id='input_11_field_1']")
    WebElement selectSequrityQestionDropDown;

    @FindBy(css = "#input_11_field_2")
    WebElement answerField;

    @FindBy(xpath = "//button[@class='jfInput-button forSubmit form-submit-button u-right']")
    WebElement nextButton;

    public void selectSecurityQuestion(String question){
        selectByVisibleTextFromDropDown(selectSequrityQestionDropDown,question);
        log.info("Selecting security question: '"+question);
    }

    public void enterAnswer(String answer){
        sendTextToElement(answerField,answer);
        log.info("Entering answer of security question: "+answer);
    }
}
