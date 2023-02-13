package org.example.lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AbstractTest{
    private static WebElement passwordInputField;
    private static WebElement loginInputField;
    private static WebDriver driver;
    static WebDriver webDriver;

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
    Assertions.assertTrue(true);
    }
    @Test
    public void loginTest() {
        WebElement webElement1 = driver.findElement(By.xpath(".//[@id=\"root\"]/header/nav/div/button"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.name("Мое"));
        webElement2.click();
        WebElement webElement3 = driver.findElement(By.name("E-mail"));
        webElement3.click();
        loginInputField.click();
        loginInputField.sendKeys("pkd76781@omeie.com");
        passwordInputField.click();
        passwordInputField.sendKeys("Geekbrain2023");
        WebElement webElement4 = driver.findElement(By.name("Войти"));
        webElement4.click();
        WebElement accountMenu = webElement2;
        Assertions.assertTrue(accountMenu.isDisplayed(), "The account menu item is not displayed");
    }
    public WebDriver getWebDriver(){
        return this.webDriver;}
}