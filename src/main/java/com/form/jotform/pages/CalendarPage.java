package com.form.jotform.pages;

import com.form.jotform.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends Utility {

    private static final Logger log = LogManager.getLogger(CalendarPage.class.getName());

    public CalendarPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@aria-label='Calendar icon']//*[name()='svg']")
    WebElement calendarButton;

    @FindBy(css = "div[data-type='control_datetime'] button[aria-label='Next']")
    WebElement nextButton;

    @FindBy(xpath = "//div[@id='calendar-container-10']//div//table//tr//td[@class='title']")
    WebElement monthTitle;

    @FindBy(xpath = "//div[@id='calendar-container-10']//div//table//tr//td[@class='button previousYear']")
    WebElement previousYearButton;

    @FindBy(xpath = "//div[@id='calendar-container-10']//div//table//tr//td[@class='button previousMonth']")
    WebElement previousMonthButton;

    @FindBy(xpath = "//div[@id='calendar-container-10']//div//table//tr//td[@class='button todayButton']")
    WebElement todayButton;

    @FindBy(xpath = "//div[@id='calendar-container-10']//div//table//tr//td[@class='button nextMonth']")
    WebElement nextMonthButton;

    @FindBy(xpath = "//div[@id='calendar-container-10']//div//table//tr//td[@class='button nextYear']")
    WebElement nextYearButton;

    @FindBy(xpath = "//div[@id='calendar-container-10']//div//table//tr[@class='days']//td[@class='' or @class='weekend']")
    WebElement datesOfCurrentMonth;

    @FindBy(xpath = "//input[@id='lite_mode_10']")
    WebElement dateFieldBox;


    public void selectDateOfBirth() {
        String day = "02";
        String month = "October";
        String year = "2000";

       sendTextToElement(dateFieldBox, "2000-11-21");
        log.info("Selecting date: " + dateFieldBox.getText());
    }

    public void clickOnNextButton() {
       clickOnElement(nextButton);
        log.info("Clicking on next button: " + nextButton);
    }


}
