package org.example.lesson7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogCreatePage extends AbstractPage {

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

    public BlogCreatePage(WebDriver driver) {
        super(driver);
    }

}