package com.form.jotform.pages;

import com.form.jotform.propertyreader.PropertyReader;
import com.form.jotform.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@id='jfCard-welcome-start']")
    WebElement nextButton;

    public void clickOnNextButton(){
        clickOnNextButton();
        log.info("Clicking on next button. "+nextButton.toString());
    }

    public void verifyHomePage(){
        String expected = PropertyReader.getInstance().getProperty("baseUrl");
        String actual = driver.getCurrentUrl();
        log.info("Verifying Home Page ."+actual);
        AssertJUnit.assertEquals(expected,actual);
    }



}
