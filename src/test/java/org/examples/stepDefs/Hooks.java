package org.examples.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void pretest()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
    }

    @After
    public void close_browser() throws InterruptedException {
       driver.quit();
    }

}
