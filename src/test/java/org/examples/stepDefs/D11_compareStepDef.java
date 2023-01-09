package org.examples.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.examples.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D11_compareStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user click on compare button")
    public void addAndroidPhoneToCart()
    {
        homePage.compareBTN(Hooks.driver).click();
    }

    @Then("comparison success message is displayed")
    public void validate_msg() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.success_msg(Hooks.driver).getText(),
                "The product has been added to your product comparison");
        softAssert.assertAll();
    }
}
