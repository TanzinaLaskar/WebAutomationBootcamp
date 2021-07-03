package com.cnn.alltest;

import common.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

public class PoliticesLinkTest extends TestBase {

    private static final Logger logger = Logger.getLogger(PoliticesLinkTest.class);

    private void verifyPoliticesLinkTest() {
    }

    @Test
    public void readPoliticsLinkNewsTest(){
        PoliticesLinkTest politicesLinkTest = PageFactory.initElements(driver,PoliticesLinkTest.class);
        politicesLinkTest.verifyPoliticesLinkTest();
        ExtentTestManager.log("Read news politics page",logger);
    }




}
