package com.form.jotform.cucumber.steps;

import com.form.jotform.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.AssertJUnit;

import java.awt.*;

public class HomeSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new HomePage().verifyHomePage();
    }

    @When("^I click on next button$")
    public void iClickOnNextButton() {
        new HomePage().clickOnNextButton();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String text) {
        new NamePage().enterFirstName(text);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String text) {
        new NamePage().enterLastName(text);
    }

    @And("^I click on next button on name page$")
    public void iClickOnNextButtonOnNamePage() {
        new NamePage().clickOnNextButton();
    }

    @And("^I select file to upload$")
    public void iSelectFileToUpload() throws AWTException, InterruptedException {

        //new FileUploadPage().FileUpload();
        Thread.sleep(10000);
    }

    @And("^I click on next button on file upload page$")
    public void iClickOnNextButtonOnFileUploadPage() {
        //  new UploadFilePage().clickOnNextButton();
    }

    @And("^I click on next button on signature page$")
    public void iClickOnNextButtonOnSignaturePage() {
        new SignaturePage().clickOnNextButton();
    }

    @And("^I select date of birth$")
    public void iSelectDateOfBirth() {
        new CalendarPage().selectDateOfBirth();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("^I click on next button on date of birth page$")
    public void iClickOnNextButtonOnDateOfBirthPage() {
        new CalendarPage().clickOnNextButton();
    }

    @And("^I select security question \"([^\"]*)\"$")
    public void iSelectSecurityQuestion(String text) {
        new SecurityQuestionPage().selectSecurityQuestion(text);
    }

    @And("^I enter answer of security question$")
    public void iEnterAnswerOfSecurityQuestion() {
        new SecurityQuestionPage().enterAnswer("Sports");
    }

    @And("^I click on submit button on security question page$")
    public void iClickOnSubmitButtonOnSecurityQuestionPage() {
       // new SecurityQuestionPage().clickOnNextButton();
    }

    @Then("^I should see successful submission message \"([^\"]*)\"$")
    public void iShouldSeeSuccessfulSubmissionMessage(String expected) {
        String actual = new SubmissionPage().verifySubmission();
        AssertJUnit.assertEquals(expected, actual);
    }

    @And("^I perform signature on signature page$")
    public void iPerformSignatureOnSignaturePage() {
        new SignaturePage().signaturePerform();
    }

}