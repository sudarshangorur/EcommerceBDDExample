package com.ecommerce.bdd.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GlobalNavigation {

    WebDriver webDriver;

    public GlobalNavigation() {
    }

    public GlobalNavigation(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public ShoppingCartPage goToCart() {
        webDriver.findElement(By.id("ctl00_ctlCustomersAccountMenuO_ctlMiniBag_miniBasketTitle")).click();
        return new ShoppingCartPage(webDriver);
    }

}
