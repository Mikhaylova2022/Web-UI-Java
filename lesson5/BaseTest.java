package org.example.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.xml.sax.Locator;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    private static WebDriver driver;

    @BeforeAll

    static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @BeforeEach
    void getPage(){
        driver.get("https://spletnik.ru/");
    }

    @AfterAll
    static void close() {
        driver.quit();
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public static WebElement getElement(String locator, Locator type) {
        WebElement element = null;
        return element;
    }

}