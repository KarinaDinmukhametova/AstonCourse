package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class PaymentWindow {
    private WebDriver driver;
    private WebDriverWait wait;
    private Exception lastError;

    private final By frame = By.xpath("//iframe[@class='payment-widget-iframe']");

    public PaymentWindow(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }


    private <T> T waitInFrame(Function<WebDriver, T> action) {
        lastError = null;
        try {
            return wait.until(d -> {
                try {
                    d.switchTo().defaultContent();
                    d.switchTo().frame(d.findElement(frame));
                    return action.apply(d);
                } catch (WebDriverException e) {
                    lastError = e;
                    return null;
                }
            });
        } catch (TimeoutException e) {
            String reason = (lastError == null)
                    ? "ошибок не было, но искомый элемент или текст так и не появился"
                    : lastError.getClass().getSimpleName() + ": " + firstLine(lastError.getMessage());
            throw new AssertionError("Не дождались нужного в окне оплаты. Причина: " + reason, e);
        }
    }

    private String firstLine(String message) {
        if (message == null) {
            return "";
        }
        return message.split("\n")[0];
    }


    private String snapshot() {
        try {
            driver.switchTo().defaultContent();
            driver.switchTo().frame(driver.findElement(frame));
            String text = driver.findElement(By.xpath("//body")).getText();
            int nested = driver.findElements(By.xpath("//iframe")).size();
            return "[вложенных iframe: " + nested + "] текст окна: \"" + text + "\"";
        } catch (WebDriverException e) {
            return "не удалось прочитать окно: " + firstLine(e.getMessage());
        }
    }


    private boolean isShown(String xpath) {
        Boolean result = waitInFrame(d -> {
            List<WebElement> elements = d.findElements(By.xpath(xpath));
            for (WebElement element : elements) {
                if (element.isDisplayed()) {
                    return true;
                }
            }
            return null;
        });
        return result;
    }


    public String getWindowText() {
        try {
            return waitInFrame(d -> {
                String text = d.findElement(By.xpath("//body")).getText();
                return text.contains("BYN") ? text : null;
            });
        } catch (AssertionError e) {

            return "НЕ ДОЖДАЛИСЬ BYN. " + e.getMessage() + " | " + snapshot();
        }
    }


    public String getButtonText() {
        return waitInFrame(d -> {
            WebElement button = d.findElement(By.xpath("//button[contains(.,'Оплатить')]"));
            return button.isDisplayed() ? button.getText() : null;
        });
    }


    public boolean isLabelShown(String text) {
        return isShown("//*[contains(text(),'" + text + "')] | //input[contains(@placeholder,'" + text + "')]");
    }


    public boolean isLogo1Shown() {
        return isShown("(//img[contains(@src,'visa') or contains(@alt,'visa') or contains(@alt,'Visa')])[1]");
    }

    public boolean isLogo2Shown() {
        return isShown("(//img[contains(@src,'master') or contains(@alt,'master') or contains(@alt,'Master')])[1]");
    }

    public boolean isLogo3Shown() {
        return isShown("(//img[contains(@src,'belkart') or contains(@alt,'belkart') or contains(@alt,'Belkart')])[1]");
    }

    public boolean isLogo4Shown() {
        return isShown("(//img[contains(@src,'mir') or contains(@alt,'mir') or contains(@alt,'Mir')])[1]");
    }
}