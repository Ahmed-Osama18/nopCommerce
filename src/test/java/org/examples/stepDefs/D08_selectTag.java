package org.examples.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.examples.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D08_selectTag {
    P03_homePage homePage = new P03_homePage();

    @When("user click on any category")
    public void clickOnApparel()
    {
        homePage.apparel_Locator(Hooks.driver).click();
    }

    @And("user click on any tag item")
    public void clickOnAwesomeTag()
    {
        homePage.awesomeTagLocator(Hooks.driver).click();
    }

    @Then("tag windows should be open")
    public void validateCameraTag()
    {
        Assert.assertTrue(homePage.getTagTitle(Hooks.driver).contains("awesome"));
    }
}
