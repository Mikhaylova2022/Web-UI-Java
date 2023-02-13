package org.example.lesson7;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.List;
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
    @AfterEach

    @Test
    @DisplayName("Дай логи")
    @Description("Создаем логи")
    @Link("http://google.com")
    @Issue("https://spletnik.ru/")
    @Severity(SeverityLevel.NORMAL)
    void testLogs(){
        LogEntries browserLogs = getWebDriver().manage().logs().get(LogType.BROWSER);
        List<LogEntry> allLogRows = browserLogs.getAll();
        if (allLogRows.size() > 0 ) {
            allLogRows.forEach(logEntry -> {
                System.out.println(logEntry.getMessage());
            });
        }
        driver.quit();
    }
}
