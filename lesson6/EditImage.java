package org.example.lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class EditImage extends LoginTest {

    private static WebElement passwordInputField;
    private static WebElement loginInputField;
    private static WebDriver driver;

    @FindBy(xpath = ".//[@id=\"root\"]/header/nav/div/button")
    private WebElement Menu;

    @FindBy(name = "Мое")
    private WebElement buttonMy;

    @FindBy(name = "E-mail")
    private WebElement  Email;

    @FindBy(name = "loginInputField")
    private WebElement loginInput;
    @FindBy(name = "passwordInputField")
    private WebElement passwordInput;
    @FindBy(name = "Войти")
    private WebElement buttonSubmit;

    @FindBy(name = "Настройки")
    private WebElement Settings;

    @FindBy(name = "Личные данные")
    private WebElement buttonMyInfo;

    @FindBy(className = "u1n25vdx")
    private WebElement choiseImage;

    @FindBy(name ="Готово")
    private WebElement complete;
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

        Menu.click();
        buttonMy.click();
        Email.click();
        loginInput.click();
        loginInputField.sendKeys("pkd76781@omeie.com");
        passwordInput.click();
        passwordInputField.sendKeys("Geekbrain2023");
        buttonSubmit.click();
        WebElement accountMenu = buttonMy;
        Assertions.assertTrue(accountMenu.isDisplayed(), "The account menu item is not displayed");
    }
    @Test
   public void editImage() {

        buttonMy.click();
        Settings.click();
        buttonMyInfo.click();
        choiseImage.click();
        complete.click();
        Assertions.assertTrue(true, "The image changed");
    }
        @AfterAll
        static void close() {
            driver.quit();
    }
}