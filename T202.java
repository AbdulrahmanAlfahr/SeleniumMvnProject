package SeleniumTasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class T202 {
    //Task 2: Page Source Validation
    //Setup:
    static WebDriver driver;

    //Use @BeforeEach to open Chrome and maximize.
    @BeforeEach
    void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    //Test1:
    @Test
    void testWebDriver() {
        //Navigate to https://www.selenium.dev/.
        driver.get("https://www.selenium.dev/");

        //Verify that the page source contains the word "WebDriver".
        String pageSource = driver.getPageSource();
        assertTrue(pageSource.contains("WebDriver"), "Page source should contain 'WebDriver'");
    }


    //Test2:
    @Test
    void testPython() {
        //Navigate to https://www.python.org/.
        driver.get("https://www.python.org/");

        //Assert the page source contains "Python".
        String pageSource = driver.getPageSource();
        assertTrue(pageSource.contains("Python"), "Page source should contain 'Python'");

    }

    //Teardown:
    //Close the browser with @AfterEach.
    @AfterEach
    void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
