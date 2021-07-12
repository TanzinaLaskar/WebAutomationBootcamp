package com.amazon.searchtest;

import com.amazon.searchitem.SearchItemFromDatabase;
import common.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

import java.sql.SQLException;
import java.util.ArrayList;

public class SearchItemFromDatabaseTest extends TestBase {
    private static final Logger logger = Logger.getLogger(SearchTest.class);
    SearchItemFromDatabase searchItemFromDatabase;

    @Test
    public void validateUserSearchAnItemFromDataBase() throws SQLException {
        String query = "select * from testData; ";
        ArrayList<String> data = connectToDataBaseAndGetData(query,"booknames");
         searchItemFromDatabase =PageFactory.initElements(driver,SearchItemFromDatabase.class);
        ExtentTestManager.log("Get data from database",logger);
        searchItemFromDatabase.typeOnSearchBar(data.get(0));
        searchItemFromDatabase.typeOnSearchBar(data.get(1));
        searchItemFromDatabase.typeOnSearchBar(data.get(2));
        ExtentTestManager.log(data.get(0) + " type on search bar", logger);
        ExtentTestManager.log(data.get(1) + " type on search bar", logger);
        ExtentTestManager.log(data.get(2) + " type on search bar", logger);
        searchItemFromDatabase.clickOnSearchButton();
        ExtentTestManager.log("Clicked on search bar", logger);
    }
}
