package org.examples.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.examples.pages.P03_homePage;
import org.examples.pages.P05_checkoutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D12_successfulOrderStepDef {
    P03_homePage homePage = new P03_homePage();
    P05_checkoutPage checkoutPage = new P05_checkoutPage(Hooks.driver);

    @And("user click on shopping cart")
    public void clickOnShoppingCart()
    {
        homePage.shoppingCart(Hooks.driver).click();
    }

    @And("user click on accept terms")
    public void clickOnAcceptTerms()
    {
        homePage.acceptTerms(Hooks.driver).click();
    }

    @And("user click on checkout button")
    public void clickOnCheckoutButton()
    {
        homePage.checkoutBTN(Hooks.driver).click();
    }

    @And("fill billing address data")
    public void billingAddress()
    {
        try {
            checkoutPage.selectCountry("123");
            checkoutPage.enterCity("october");
            checkoutPage.enterAddress("2nd");
            checkoutPage.enterZipCode("15921");
            checkoutPage.enterPhoneNumber("0155065");
            checkoutPage.clickOnContinueBillingAddress();
        } catch (Exception e) {
            checkoutPage.clickOnContinueBillingAddress();
        }
    }

    @And("choose shipping method")
    public void shippingMethod()
    {
        checkoutPage.clickOnContinueShippingMethod();
    }

    @And("choose payment method")
    public void paymentMethod()
    {
        checkoutPage.clickOnContinuePaymentMethod();
    }

    @And("choose payment info")
    public void paymentInfo()
    {
        checkoutPage.clickOnContinuePaymentInfo();
    }

    @And("Confirm Order")
    public void confirmOrder()
    {
        checkoutPage.clickOnContinueConfirmOrder();
    }

    @Then("Order has been successfully processed")
    public void validateSuccessfulOrder()
    {
        Assert.assertEquals(checkoutPage.getOrderMessage(),
                "Your order has been successfully processed!",
                "problem while processing order");
    }



}
