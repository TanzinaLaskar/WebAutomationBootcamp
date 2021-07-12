package com.citibank.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderTest {
    //citiBank data
    @DataProvider(name ="getDataForCitibankCredential")
    public static Object [][] citibankPlanData(){
        return new Object[][]{
                {"18745","Tom12354"},
        };
    }




















}
