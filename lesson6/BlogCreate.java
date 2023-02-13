package org.example.lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class BlogCreate  extends AbstractTest {

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
    @FindBy(name = "Создать")
    private WebElement NewPost;

    @FindBy(xpath = ".//[@id=\"root\"]main/div/div/div[1]/div[2]/div[1]/textarea")
    private WebElement heading;

    @FindBy(xpath = ".//[@id=\\\"root\\\"]/main/div/div/div[1]/div[2]/div[2]/textarea")
    private WebElement subtitle;

    @FindBy(xpath = ".//[@id=\\\"root\\\"]/main/div/div/div[1]/div[2]/div[3]/textarea")
    private WebElement description;
    @FindBy(className = "i1w98koc")
    private WebElement text;

    @FindBy(name ="Опубликовать")
    private WebElement publishPost;
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
    public void blogCreate() {
        NewPost.click();
        heading.click();
        heading.sendKeys(".");
        subtitle.click();
        subtitle.sendKeys(".");
        description.click();
        description.sendKeys(".");
        text.click();
        publishPost.click();
        Assertions.assertTrue(true, "Created");
    }
    @AfterAll
    static void close() {
        driver.quit();
    }
}