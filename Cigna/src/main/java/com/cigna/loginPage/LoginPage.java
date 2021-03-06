package com.cigna.loginPage;

import common.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//header/div[2]/nav[2]/div[1]/ul[1]/li[2]/a[1]")
    WebElement loginButton;
    @FindBy(css = "input#username")
    WebElement userName ;
    @FindBy(css = "input#password")
    WebElement password ;
    @FindBy(xpath = "//input[@id='loginbutton']")
    WebElement loginButtonForSignIn ;
    @FindBy(xpath = "//div[@id='alertmessage']")
    WebElement errorMessage;
    @FindBy(xpath = "//p[normalize-space()='Username required.']")
    WebElement errorMessageForUserName;
    @FindBy(xpath = "//p[normalize-space()='Password required.']")
    WebElement errorMessageForPassword;


    //Action
    public void clickOnLoginButton(){
        loginButton.click();
        sleepFor(2);
    }
    public void clickOnUserName(String username){
        userName.sendKeys(username);
    }
    public void clickOnPassword(String passwords){
        password.sendKeys(passwords);
    }

    public void clickOnLogin(){
        loginButtonForSignIn.click();
    }

    public boolean errorMessage(){
       return errorMessage.isDisplayed();
    }

    public String errorMessageForUsername(){
       return errorMessage.getText();
    }

    public String errorMessageForPassword(){
       return errorMessageForPassword.getText();
    }









}
