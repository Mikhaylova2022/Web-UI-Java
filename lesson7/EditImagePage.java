package org.example.lesson7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class EditImagePage extends AbstractPage {

    @FindBy(name = "Мое")
    private WebElement buttonMy;

    @FindBy(name = "Настройки")
    private WebElement Settings;

    @FindBy(name = "Личные данные")
    private WebElement buttonMyInfo;

    @FindBy(className = "u1n25vdx")
    private WebElement ChoiseImage;
    @FindBy(name ="Готово")
    private WebElement passwordInput;

    public EditImagePage(WebDriver driver) {
        super(driver);
    }

    public static class EditImagePage extends AbstractPage {

        @FindBy(name = "Мое")
        private WebElement buttonMy;

        @FindBy(name = "Настройки")
        private WebElement Settings;

        @FindBy(name = "Личные данные")
        private WebElement buttonMyInfo;

        @FindBy(className = "u1n25vdx")
        private WebElement choiseImage;

        @FindBy(name ="Готово")
        private WebElement complete;

        public EditImagePage(WebDriver driver) {
            super(driver);
        }

    }

    public static class LoginPage extends AbstractPage {

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

        public LoginPage(WebDriver driver) {
            super(driver);
        }

        public void loginIn(){
            this.buttonSubmit.click();
        }

        public org.example.lesson7.LoginPage setLogin(String login){
            this.loginInput.sendKeys(login);
            return this;
        }

        public org.example.lesson7.LoginPage setPassword(String password){
            this.passwordInput.click();
            this.passwordInput.sendKeys(password);
            return this;
        }

        public void loginIn(String login, String password){

            Actions loginIn = new Actions(getDriver());
            loginIn
                    .sendKeys(this.loginInput,login)
                    .click(this.passwordInput)
                    .sendKeys(password)
                    .click(this.buttonSubmit)
                    .build()
                    .perform();
        }
    }
}