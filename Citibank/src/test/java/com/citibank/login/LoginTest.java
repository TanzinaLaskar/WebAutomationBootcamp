package com.citibank.login;

import com.citibank.loginpage.LoginPage;
import com.citibank.dataprovider.DataProviderTest;

import common.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

public class LoginTest extends TestBase {
    private static final Logger logger = Logger.getLogger(LoginTest.class);


    @Test(dataProviderClass = DataProviderTest.class,dataProvider = "getDataForCitibankCredential")
    public void usersCanValidateLogIn(String id , String pass){
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.verifyUserId(id);
        ExtentTestManager.log(id+" enter on User id field",logger);
        loginPage.verifyPassword(pass);
        ExtentTestManager.log(pass+" enter on password field",logger);
        String expectedTitle = loginPage.getTitleOfHomePage();
        String actualTitle = "Online Banking, Mortgages, Personal Loans, Investing | Citi.com";
        Assert.assertEquals(expectedTitle,actualTitle);
        loginPage.clickSignOnButton();
    }








}
