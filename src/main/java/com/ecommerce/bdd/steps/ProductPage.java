package com.ecommerce.bdd.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends GlobalNavigation {

    WebDriver webDriver;

    public ProductPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public ProductPage addProductToCart() {
        webDriver.findElement(By.id("ctl00_ContentMainPage_ctlSeparateProduct_btnAddToBasket")).click();
        waitForTheCartToChangeValue();
        return this;
    }

    private void waitForTheCartToChangeValue() {
        WebElement priceOfProduct = webDriver.findElement(By.id("ctl00_ctlCustomersAccountMenuO_ctlMiniBag_lblBasketItemTotalPrice"));
        ExpectedConditions.textToBePresentInElement(priceOfProduct, "59.50");
    }

}
