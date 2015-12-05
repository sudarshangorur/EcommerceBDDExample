package com.ecommerce.bdd.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    WebDriver webDriver;

    public ShoppingCartPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getProductName() {
        return webDriver.findElement(By.id("ctl00_ContentMainPage_rptBasketItems_ctl01_ctlBasketItem_hypItemName")).getText();
    }

    public void close() {
        webDriver.quit();
    }

}
