package org.examples.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.examples.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D09_addToCartStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user click on add to cart")
    public void addAndroidPhoneToCart()
    {
        homePage.addToCartBtn(Hooks.driver).click();
    }

    @Then("added success message is displayed")
    public void validate_msg() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.success_msg(Hooks.driver).getText(),
                "The product has been added to your shopping cart");
        softAssert.assertAll();
    }
}
