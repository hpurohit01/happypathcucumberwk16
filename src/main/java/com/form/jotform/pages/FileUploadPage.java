package com.form.jotform.pages;

import com.form.jotform.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class FileUploadPage extends Utility {
    private static final Logger log = LogManager.getLogger(FileUploadPage.class.getName());

    public FileUploadPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='jfUpload-container']//div//div[2]//div[@class='jfUpload-subheading']//span[contains(text(),'MB')]")
    WebElement fileSizeText;

    @FindBy(xpath = "//div[@data-type='control_fileupload']//div[@class='jfCard-actions']//button[2]")
    WebElement nextButton;

    @FindBy(xpath = "//ul[@class='qq-upload-list']//li[@actual-filename='file.docx']")
    WebElement uploadVerifyBox;

    @FindBy(xpath = "//div[@class='jfUpload-container']//div[2][@class='jfUpload-button-container']//label")
    WebElement browserFilesButton;

    public void setClipBoard(String file){

        StringSelection obj = new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
    }



    public void verifyFileUpload() {
        boolean actual = uploadVerifyBox.getText().contains("file");
        log.info("verifying upload: ");
        Assert.assertTrue(actual);
    }

    public void clickOnNextButton() {
        log.info("Clicking on next button. ");
        clickOnElement(nextButton);
    }
}

