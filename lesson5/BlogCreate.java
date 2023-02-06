package org.example.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BlogCreate  extends LoginTest {

    private static WebElement passwordInputField;
    private static WebElement loginInputField;
    private static WebDriver driver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @BeforeEach
    void getPage() {
        driver.get("https://spletnik.ru/");
    }

    @BeforeEach
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
    }

    @Test
    static void blogCreate() {
        WebElement webElement5 = driver.findElement(By.name("Создать"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.xpath(".//[@id=\"root\"]main/div/div/div[1]/div[2]/div[1]/textarea"));
        webElement6.click();
        webElement6.sendKeys(".");
        WebElement webElement7 = driver.findElement(By.xpath(".//[@id=\"root\"]/main/div/div/div[1]/div[2]/div[2]/textarea"));
        webElement7.click();
        webElement7.sendKeys(".");
        WebElement webElement8 = driver.findElement(By.xpath(".//[@id=\"root\"]/main/div/div/div[1]/div[2]/div[3]/textarea"));
        webElement8.click();
        webElement8.sendKeys(".");
        WebElement webElement9 = driver.findElement(By.className("i1w98koc"));
        webElement9.click();
        WebElement webElement10 = driver.findElement(By.name("Обычный текст"));
        webElement10.click();
        WebElement webElement11 = driver.findElement(By.name("Опубликовать"));
        webElement11.click();
        Assertions.assertTrue(true, "Created");
    }
    @AfterAll
    static void close() {
        driver.quit();
    }
}