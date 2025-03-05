package ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTests {
    WebDriver driver;

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    void openHomePageTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();

        Assertions.assertEquals("Hands-On Selenium WebDriver with Java123", actualTitle);

        driver.quit();

    }

    @Test
    void openWebFormTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");

        WebElementsPage elementsPage = driver.findElement(By.xpath("//a[@href='web-form.html']"));
        elementsPage.click();

        driver.quit();

    }
}
