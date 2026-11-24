package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get("https://www.mts.by/");
    }

    public void acceptCookies() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(., 'Принять')]"))).click();
    }



    public String getTitle() {
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//section[@class='pay']//h2"))).getText();
        return text.replaceAll("\\s+", " ").trim();
    }

    // логотипы платёжных систем на главной странице
    public boolean isLogo1Shown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='pay__partners']//img)[1]"))).isDisplayed();
    }

    public boolean isLogo2Shown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='pay__partners']//img)[2]"))).isDisplayed();
    }

    public boolean isLogo3Shown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='pay__partners']//img)[3]"))).isDisplayed();
    }

    public boolean isLogo4Shown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='pay__partners']//img)[4]"))).isDisplayed();
    }

    public boolean isLogo5Shown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='pay__partners']//img)[5]"))).isDisplayed();
    }

    public boolean isLogo6Shown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='pay__partners']//img)[6]"))).isDisplayed();
    }


    public void clickDetailsLink() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()='Подробнее о сервисе']"))).click();
    }



    public void selectConnection() {
        selectOption("Услуги связи");
    }

    public void selectInternet() {
        selectOption("Домашний интернет");
    }

    public void selectInstalment() {
        selectOption("Рассрочка");
    }

    public void selectArrears() {
        selectOption("Задолженность");
    }

    private void selectOption(String name) {
        By header = By.xpath("//button[contains(@class,'select__header')]");
        By option = By.xpath("//ul[contains(@class,'select__list')]//p[text()='" + name + "']");

        wait.until(d -> {
            try {
                WebElement item = firstDisplayed(d, option);
                if (item == null) {
                    d.findElement(header).click();
                    return null;
                }
                item.click();
                return true;
            } catch (WebDriverException e) {
                return null;
            }
        });
    }

    private WebElement firstDisplayed(WebDriver d, By locator) {
        for (WebElement element : d.findElements(locator)) {
            if (element.isDisplayed()) {
                return element;
            }
        }
        return null;
    }



    public String getPlaceholder(String fieldId) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id='" + fieldId + "']"))).getAttribute("placeholder");
    }

    public void fillPhone(String phone) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id='connection-phone']"))).sendKeys(phone);
    }

    public void fillSum(String sum) {
        driver.findElement(By.xpath("//input[@id='connection-sum']")).sendKeys(sum);
    }


    public PaymentWindow clickBankCard() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//form[contains(@class,'opened')]//button[@data-method='card']"))).click();
        return new PaymentWindow(driver);
    }
}