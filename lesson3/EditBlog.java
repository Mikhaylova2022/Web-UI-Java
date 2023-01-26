package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class EditBlog {

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


        WebElement webElement1 = driver.findElement(By.name("E-mail"));
        webElement1.click();
        loginInputField.click();
        loginInputField.sendKeys("pkd76781@omeie.com");
        passwordInputField.click();
        passwordInputField.sendKeys("Geekbrain2023");
        WebElement webElement2 = driver.findElement(By.name("Посты"));
        webElement2.click();
        WebElement webElement3= driver.findElement(By.className("sd8n4yi"));
        webElement3.click();
        WebElement webElement4 = driver.findElement(By.name("Снять с публикации"));
        webElement4.click();
        WebElement webElement5= driver.findElement(By.name(" Редактировать"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.name("Опубликовать"));
        webElement6.click();


    }
}