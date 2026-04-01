package org.example;

import static org.testng.Assert.assertEquals;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class AppTest {
    @Test
    public void testGoogleTitle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.google.com");
            String expectedTitle = "Google";
            String actualTitle = driver.getTitle();
            assertEquals(actualTitle, expectedTitle);
            System.out.println("Test passed: Title is " + actualTitle);
        } finally {
            driver.quit();
        }
    }
}