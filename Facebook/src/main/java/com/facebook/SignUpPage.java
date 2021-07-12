package com.facebook;

import common.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Month;

public class SignUpPage extends TestBase {
    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    private WebElement signUpLink;

    @FindBy(xpath = "//div[contains(text(),'Create a New Account')]")
    private WebElement createAccountText;

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@name='reg_email__']")
    private WebElement mobileAndEmail;

    @FindBy(xpath = "//input[@id='password_step_input']")
    private WebElement newPassword;

    @FindBy(xpath = "//select[@id='month']")
    private WebElement month;

    @FindBy(xpath = "//select[@id='day']")
    private WebElement day;

    @FindBy(xpath = "//select[@id='year']")
    private WebElement year;

    @FindBy(xpath = "(//input[@name='sex'])[1]")
    private WebElement femaleRadioButton;
    @FindBy(xpath = "(//input[@name='sex'])[1]")
    private WebElement maleRadioButton;
    @FindBy(xpath = "(//input[@name='sex'])[1]")
    private WebElement customRadioButton;


    @FindBy(xpath = "//div[@class='_1lch']/button")
    private WebElement signUpButton;


    public void enterFirstName(String firstNames) {
        firstName.sendKeys(firstNames);
    }

    public void enterLastName(String lastNames) {
        lastName.sendKeys(lastNames);
    }

    public void enterMobileNumber(String mobileNumber) {
        mobileAndEmail.sendKeys(mobileNumber);
    }

    public void enterNewPassword(String newPasswords) {
        newPassword.sendKeys(newPasswords);
    }

    public void selectMonthFromDropDown(String month) {
    }
    public void selectDayFromDropDown() {
        selectByVisibleText(day, "5");
    }

    public void selectYearDropDown() {
        selectByVisibleText(year, "2006");
    }

    public void clickOnSignUpLinks() {
        signUpLink.click();
    }

    public void selectGenderForFemale() {
        femaleRadioButton.click();
    }
    public void selectGenderForMale() {
        maleRadioButton.click();
    }
    public void selectGenderForCustom() {
        customRadioButton.click();
    }

    public void clickOnSignUpButton() {
        signUpButton.click();
    }
    public boolean signUpButtonDisplay() {
        return signUpButton.isDisplayed();
    }
    public boolean createAccountText() {
        return createAccountText.isDisplayed();
    }
    public String signUpPageTitle() {
        return getTitle();
    }


}
