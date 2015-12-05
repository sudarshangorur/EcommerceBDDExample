package com.ecommerce.bdd.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.Assert.assertEquals;

public class AddToCartSteps {

    AsosHomePage asosHomePage;
    ProductPage productPage;
    ShoppingCartPage shoppingCartPage;

    @Given("^I have added an item to my cart$")
    public void iHaveAddedAnItemToMyCart() {
        asosHomePage = new AsosHomePage();
        productPage = asosHomePage.searchFor("Fjallraven Ovik Messenger Bag");
        productPage.addProductToCart();
    }

    @When("^I view the contents of my cart$")
    public void iViewTheContentsOfMyCart() {
        shoppingCartPage = productPage.goToCart();
    }

    @Then("^I should see the contents of the cart include the item$")
    public void iShouldSeeTheContentsOfTheCartIncludeTheItem() {
        String actualProductName = shoppingCartPage.getProductName();
        assertEquals("", actualProductName);
    }
}
