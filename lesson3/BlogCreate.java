package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BlogCreate {

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
        WebElement webElement2 = driver.findElement(By.name("Создать"));
        webElement2.click();
        WebElement webElement3 = driver.findElement(By.xpath(".//[@id=\"root\"]main/div/div/div[1]/div[2]/div[1]/textarea"));
        webElement3.click();
        webElement3.sendKeys(".");
        WebElement webElement4 = driver.findElement(By.xpath(".//[@id=\"root\"]/main/div/div/div[1]/div[2]/div[2]/textarea"));
        webElement4.click();
        webElement4.sendKeys(".");
        WebElement webElement5 = driver.findElement(By.xpath(".//[@id=\"root\"]/main/div/div/div[1]/div[2]/div[3]/textarea"));
        webElement5.click();
        webElement5.sendKeys(".");
        WebElement webElement6 = driver.findElement(By.className("i1w98koc"));
        webElement6.click();
        WebElement webElement7 = driver.findElement(By.name("Обычный текст"));
        webElement7.click();
        WebElement webElement8 = driver.findElement(By.name("Опубликовать"));
        webElement8.click();

    }
}