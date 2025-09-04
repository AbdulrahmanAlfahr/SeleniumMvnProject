package SeleniumTasks;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class T203 {
    //    Task 3: Browser Size and Position
    //    Setup:
    static WebDriver driver;
    //    Open Chrome in @BeforeEach.
    @BeforeEach
    void openBrowser() {
        driver = new ChromeDriver();
    }
    //            Test 1:
    @Test
    void testSetBrowserSize(){
        //    Navigate to https://www.bbc.com/.
        driver.get("https://www.google.com");

        //    Set browser size to 800x600 and assert the window size.
        Dimension targetSize = new Dimension(800,600);
        driver.manage().window().setSize(targetSize);

        Dimension actualSize = driver.manage().window().getSize();

        assertEquals(800,actualSize.getWidth(), "window width should be 800px");
        assertEquals(600,actualSize.getHeight(), "window Height should be 600px");

    }

    //            Test 2:
    @Test
    void testPosition(){
        driver.get("https://www.google.com");

        //    Move the window to position (100, 100) and assert its position.
        Point targetPosition = new Point(100,100);
        driver.manage().window().setPosition(targetPosition);

        Point actualPosition = driver.manage().window().getPosition();

        assertEquals(100,actualPosition.getX(), "X should be 100px");
        assertEquals(100,actualPosition.getY(), "Y should be 100px");
    }

    //    Teardown:
    @AfterEach
    void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}



