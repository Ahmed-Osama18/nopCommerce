package org.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P04_forgetPasswordPage {
    WebDriver driver;

    public P04_forgetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement email() {
        return driver.findElement(By.id("Email"));
    }

    public WebElement recover_BTN() {
        return driver.findElement(By.className("password-recovery-button"));
    }

    public WebElement Confirmation_MSG()
    {
        return driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]/p"));
    }
}
