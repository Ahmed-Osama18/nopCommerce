package org.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P05_checkoutPage {
    WebDriver driver;

    public P05_checkoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCountry(String value)
    {
        Select select = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        select.selectByValue(value);
    }

    public void enterCity(String city)
    {
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys(city);
    }

    public void enterAddress(String address)
    {
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys(address);
    }

    public void enterZipCode(String code)
    {
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys(code);
    }

    public void enterPhoneNumber(String num)
    {
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys(num);
    }

    public void clickOnContinueBillingAddress()
    {
        driver.findElement(By.xpath("//div[@id=\"billing-buttons-container\"]/button[@class=\"button-1 new-address-next-step-button\"]")).click();
    }

    public void clickOnContinueShippingMethod()
    {
        driver.findElement(By.xpath("//div[@id=\"checkout-step-shipping-method\"]//button[@class=\"button-1 shipping-method-next-step-button\"]")).click();
    }

    public void clickOnContinuePaymentMethod()
    {
        driver.findElement(By.xpath("//div[@id=\"checkout-step-payment-method\"]//button[@class=\"button-1 payment-method-next-step-button\"]")).click();
    }

    public void clickOnContinuePaymentInfo()
    {
        driver.findElement(By.xpath("//div[@id=\"checkout-step-payment-info\"]//button[@class=\"button-1 payment-info-next-step-button\"]")).click();
    }

    public void clickOnContinueConfirmOrder()
    {
        driver.findElement(By.xpath("//div[@id=\"checkout-step-confirm-order\"]//button[@class=\"button-1 confirm-order-next-step-button\"]")).click();
    }

    public String getOrderMessage()
    {
        return driver.findElement(By.xpath("//div[@class=\"page-body checkout-data\"]//div[@class=\"title\"]/strong")).getText();
    }



}
