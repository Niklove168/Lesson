package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test3 {
    private WebDriver driver;

    public Test3(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLink() {
        try {
            WebElement cookieButton = driver.findElement(By.xpath("//button[contains(@class,'cookie__cancel')]"));
            cookieButton.click();
        } catch (Exception e) {
        }
        Actions action = new Actions(driver);
        action.moveToElement(Link()).click().perform();
    }

    @FindBy(xpath = " (//a[contains(text(),'Подробнее о сервисе')])[1]")
    private WebElement linkUrl;

    public WebElement Link() {
        return linkUrl;
    }
}