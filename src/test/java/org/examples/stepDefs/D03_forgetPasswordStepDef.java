package org.examples.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.examples.pages.P02_login;
import org.examples.pages.P04_forgetPasswordPage;
import org.testng.Assert;

public class D03_forgetPasswordStepDef {
    P02_login login = new P02_login(Hooks.driver);
    P04_forgetPasswordPage forget = new P04_forgetPasswordPage(Hooks.driver);

    @And("Step 2 user click on forget password")
    public void clickOnForgetPassword()
    {
        login.forgetPassword().click();
    }

    @And("Step 3 user enter email address")
    public void enterEmail()
    {
        forget.email().sendKeys("test@example.com");
    }

    @And("Step 4 user click on recover button")
    public void clickOnRecoverBTN()
    {
        forget.recover_BTN().click();
    }

    @Then("Step 5 message is displayed \"Email with instructions has been sent to you\"")
    public void validateConfirmationMessage()
    {
        Assert.assertEquals(forget.Confirmation_MSG().getText(),
                "Email with instructions has been sent to you.",
                "something wrong happened while trying to send email");
    }
}
