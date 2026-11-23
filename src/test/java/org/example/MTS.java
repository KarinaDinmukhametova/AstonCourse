

package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MTS {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(., 'Принять')]"))).click();

    }

    @Test
    public void nameBlock() {

        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//section[@class='pay']//h2")));

        String actual = title.getText().replaceAll("\\s+", " ").trim();

        assertEquals("ОНЛАЙН ПОПОЛНЕНИЕ БЕЗ КОМИССИИ", actual);
    }

    @Test
    public void logoPayment(){
        WebElement logo1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='pay__partners']//img)[1]")));
        WebElement logo2 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='pay__partners']//img)[2]")));
        WebElement logo3 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='pay__partners']//img)[3]")));
        WebElement logo4 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='pay__partners']//img)[4]")));
        WebElement logo5 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='pay__partners']//img)[5]")));
        WebElement logo6 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='pay__partners']//img)[6]")));

        assertTrue(logo1.isDisplayed(), "Логотип 1 не отображается");
        assertTrue(logo2.isDisplayed(), "Логотип 2 не отображается");
        assertTrue(logo3.isDisplayed(), "Логотип 3 не отображается");
        assertTrue(logo4.isDisplayed(), "Логотип 4 не отображается");
        assertTrue(logo5.isDisplayed(), "Логотип 5 не отображается");
        assertTrue(logo6.isDisplayed(), "Логотип 6 не отображается");

    }

    @Test
    public void workLink() {
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[text()='Подробнее о сервисе']")));
            link.click();
        }


    @Test
    public void continueButton() {
        WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//section[@class='pay']//input[@placeholder='Номер телефона']")));
        phone.sendKeys("297777777");

        WebElement sum = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//section[@class='pay']//input[@placeholder='Сумма']")));
        sum.sendKeys("10");

        WebElement continueBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id='pay-connection']/div[4]/button[2]")));
        continueBtn.click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}