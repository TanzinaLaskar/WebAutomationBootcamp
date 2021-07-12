package com.amazon.cartpage;

import common.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ChangeQuantityFromAddToCartTest extends TestBase {
    private static final Logger logger = Logger.getLogger(ChangeQuantityFromAddToCartTest.class);
     private ChangeQuantityFromAddToCart changeQuantityFromAddToCart;

    @Test
    public void usersCanValidateChangeQuantityTest(){
        changeQuantityFromAddToCart = PageFactory.initElements(driver,ChangeQuantityFromAddToCart.class);
        changeQuantityFromAddToCart.clickOnCartButton();
        changeQuantityFromAddToCart.clickOnQuantityButton();
        changeQuantityFromAddToCart.clickOnQuantityNumber();


    }





}
