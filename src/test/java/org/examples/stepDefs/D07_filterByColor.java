package org.examples.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.examples.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class D07_filterByColor {
    P03_homePage homePage = new P03_homePage();

    @When("user hover on apparel")
    public void hoverOnApparel()
    {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(homePage.apparel_Locator(Hooks.driver)).perform();
    }


    @And("user click on shoes")
    public void clickOnShoes()
    {
        homePage.shoes_Locator(Hooks.driver).click();
    }

    @And("user choose red color")
    public void clickOnRedColor()
    {
        homePage.RedShoes_Checkbox(Hooks.driver).click();
    }

}
