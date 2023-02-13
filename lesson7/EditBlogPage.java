package org.example.lesson7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditBlogPage extends AbstractPage {

    @FindBy(name = "Посты")
    private WebElement buttonPost;

    @FindBy(className = "sd8n4yi")
    private WebElement MyPost;

    @FindBy(name = "Личные данные")
    private WebElement buttonMyInfo;

    @FindBy(name = "Снять с публикации")
    private WebElement removePost;
    @FindBy(name ="Редактировать")
    private WebElement createPost;

    @FindBy(name ="Опубликовать")
    private WebElement publishPost;

    public EditBlogPage(WebDriver driver) {
        super(driver);
    }

    public static class EditBlogPage extends AbstractPage {

        @FindBy(name = "Посты")
        private WebElement buttonPost;

        @FindBy(className = "sd8n4yi")
        private WebElement MyPost;

        @FindBy(name = "Личные данные")
        private WebElement buttonMyInfo;

        @FindBy(name = "Снять с публикации")
        private WebElement removePost;
        @FindBy(name ="Редактировать")
        private WebElement createPost;

        @FindBy(name ="Опубликовать")
        private WebElement publishPost;

        public EditBlogPage(WebDriver driver) {
            super(driver);
        }

    }
}