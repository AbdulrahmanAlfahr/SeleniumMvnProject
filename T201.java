package SeleniumTasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class T201 {



    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void testNavigationBackAndForward() {
        // Navigate to Wikipedia
        driver.navigate().to("https://www.wikipedia.org/");

        //
        String wikipediaTitle = driver.getTitle();
        assertTrue(wikipediaTitle.contains("Wikipedia"));

        // Navigate to Google
        driver.navigate().to("https://www.google.com/");

        String googleTitle = driver.getTitle();
        assertTrue(googleTitle.contains("Google"));

        // Navigate back to Wikipedia
        driver.navigate().back();
        assertEquals(wikipediaTitle, driver.getTitle());


        // Navigate forward to Google
        driver.navigate().forward();
        assertEquals(googleTitle, driver.getTitle());

        // Repeat navigation
        driver.navigate().back();
        assertEquals(wikipediaTitle, driver.getTitle());

        driver.navigate().forward();
        assertEquals(googleTitle, driver.getTitle());
    }

    @Test
    void testRefreshGooglePage() {
        driver.get("https://www.google.com/");
        String titleBeforeRefresh = driver.getTitle();

        driver.navigate().refresh();
        String titleAfterRefresh = driver.getTitle();

        assertTrue(titleAfterRefresh.contains("Google"));
        assertEquals(titleBeforeRefresh, titleAfterRefresh);
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}




