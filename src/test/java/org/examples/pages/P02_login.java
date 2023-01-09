package org.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_login {

    WebDriver driver;

    public P02_login(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement Email ()
    {
        WebElement Email = driver.findElement(By.id("Email"));
        return (Email);
    }

    public WebElement Password ()
    {
        WebElement Password = driver.findElement(By.id("Password"));
        return (Password);
    }

    public WebElement login_BTN ()
    {
        WebElement login = driver.findElement(By.className("login-button"));
        return (login);
    }

    public WebElement forgetPassword()
    {
        return driver.findElement(By.linkText("Forgot password?"));
    }

    public WebElement logout (WebDriver driver)
    {
        WebElement logout = driver.findElement(By.linkText("Log out"));
        return (logout);
    }

    public WebElement valid_Assert ()
    {
        WebElement Assert = driver.findElement(By.className("ico-account"));
        return (Assert);
    }

    public WebElement invalid_Assert ()
    {
        WebElement Assert = driver.findElement(By.className("validation-summary-errors"));
        return (Assert);
    }

}
