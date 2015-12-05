package com.ecommerce.bdd.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AsosHomePage {

    WebDriver webDriver;

    public AsosHomePage() {
        this.webDriver = new FirefoxDriver();
        webDriver.get("http://www.asos.com/men/");
    }

    public ProductPage searchFor(String product) {
        return enterSearchTerm(product).clickGo();
    }

    private AsosHomePage enterSearchTerm(String product) {
        webDriver.findElement(By.id("txtSearch")).sendKeys(product);
        return this;
    }

    private ProductPage clickGo() {
        webDriver.findElement(By.className("go")).click();
        return new ProductPage(webDriver);
    }

}
