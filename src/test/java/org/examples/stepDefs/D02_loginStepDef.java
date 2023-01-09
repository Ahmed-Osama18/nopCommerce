package org.examples.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.examples.pages.P02_login;
import org.examples.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P03_homePage homePage = new P03_homePage();
    P02_login login = new P02_login(Hooks.driver);

    @Given("Step 1 user go to login page")
    public void setLogin()
    {
        homePage.Login(Hooks.driver).click();
    }

    @And("Step 2 user login with \"valid\" \"test@example.com\" and \"P@ssw0rd\"")
    public void valid_login_Data()
    {
        login.Email().sendKeys("test@example.com");
        login.Password().sendKeys("P@ssw0rd");
    }

    @When("Step 3 user press on login button")
    public void login_BTN()
    {
        login.login_BTN().click();
    }

    @Then ("Step 4 user login to the system successfully")
    public void validate_Message()
    {
        SoftAssert soft_assert = new SoftAssert();
        soft_assert.assertEquals("https://demo.nopcommerce.com/", Hooks.driver.getCurrentUrl());
        soft_assert.assertEquals(login.valid_Assert().getText().contains("My account"),
                true, "(My Account) tab doesn't appear");
        soft_assert.assertAll();
    }

}
