package com.cnn.alltest;

import common.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

public class PoliticesLinkTest extends TestBase {

    private static final Logger logger = Logger.getLogger(PoliticesLinkTest.class);

    private void verifyPoliticsLinkTest() {
    }

    @Test
    public void usersCanValidateReadPoliticsLinkNews(){
        PoliticesLinkTest politicesLinkTest = PageFactory.initElements(driver,PoliticesLinkTest.class);
        politicesLinkTest.verifyPoliticsLinkTest();
        ExtentTestManager.log("Read news politics page",logger);
    }




}
