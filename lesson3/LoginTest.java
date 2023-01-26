package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    private static WebElement passwordInputField;
    private static WebElement loginInputField;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://spletnik.ru/");


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

    }
}
