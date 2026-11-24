package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MTS {
    private WebDriver driver;
    private MainPage page;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        page = new MainPage(driver);
        page.open();
        page.acceptCookies();
    }



    @Test
    public void nameBlock() {
        assertEquals("онлайн пополнение без комиссии", page.getTitle().toLowerCase());
    }

    @Test
    public void paymentLogos() {
        assertTrue(page.isLogo1Shown(), "Логотип 1 не отображается");
        assertTrue(page.isLogo2Shown(), "Логотип 2 не отображается");
        assertTrue(page.isLogo3Shown(), "Логотип 3 не отображается");
        assertTrue(page.isLogo4Shown(), "Логотип 4 не отображается");
        assertTrue(page.isLogo5Shown(), "Логотип 5 не отображается");
        assertTrue(page.isLogo6Shown(), "Логотип 6 не отображается");
    }

    @Test
    public void detailsLink() {
        page.clickDetailsLink();
    }



    @Test
    public void connectionPlaceholders() {
        page.selectConnection();
        assertEquals("Номер телефона", page.getPlaceholder("connection-phone"));
        assertEquals("Сумма", page.getPlaceholder("connection-sum"));
        assertEquals("E-mail для отправки чека", page.getPlaceholder("connection-email"));
    }

    @Test
    public void internetPlaceholders() {
        page.selectInternet();
        assertEquals("Номер абонента", page.getPlaceholder("internet-phone"));
        assertEquals("Сумма", page.getPlaceholder("internet-sum"));
        assertEquals("E-mail для отправки чека", page.getPlaceholder("internet-email"));
    }

    @Test
    public void instalmentPlaceholders() {
        page.selectInstalment();
        assertEquals("Номер счета на 44", page.getPlaceholder("score-instalment"));
        assertEquals("Сумма", page.getPlaceholder("instalment-sum"));
        assertEquals("E-mail для отправки чека", page.getPlaceholder("instalment-email"));
    }

    @Test
    public void arrearsPlaceholders() {
        page.selectArrears();
        assertEquals("Номер счета на 2073", page.getPlaceholder("score-arrears"));
        assertEquals("Сумма", page.getPlaceholder("arrears-sum"));
        assertEquals("E-mail для отправки чека", page.getPlaceholder("arrears-email"));
    }



    @Test
    public void paymentWindow() {
        page.selectConnection();
        page.fillPhone("297777777");
        page.fillSum("100");

        PaymentWindow window = page.clickBankCard();


        String text = window.getWindowText();
        assertTrue(text.contains("100.00"), "Сумма не найдена в окне: " + text);
        assertTrue(text.contains("297777777"), "Номер не найден в окне: " + text);


        assertTrue(window.getButtonText().contains("100.00"), "Кнопка: " + window.getButtonText());


        assertTrue(window.isLabelShown("Номер карты"));
        assertTrue(window.isLabelShown("Срок действия"));
        assertTrue(window.isLabelShown("CVC"));
        assertTrue(window.isLabelShown("Имя и фамилия на карте"));


        assertTrue(window.isLogo1Shown(), "Иконка VISA не отображается");
        assertTrue(window.isLogo2Shown(), "Иконка Mastercard не отображается");
        assertTrue(window.isLogo3Shown(), "Иконка Белкарт не отображается");
        assertTrue(window.isLogo4Shown(), "Иконка МИР не отображается");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}