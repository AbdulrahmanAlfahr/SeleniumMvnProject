package SeleniumTasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class  T302_RadioButtonSelection{

    @Test
    void radioButtonTest() throws InterruptedException {

        WebElement rb1 = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        WebElement rb2 = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        WebElement rb3 = driver.findElement(By.xpath("//label[@for='noRadio']"));


// Print enabled/disabled status
        System.out.println("Radio Button 1 (Yes) enabled: " + rb1.isEnabled());
        System.out.println("Radio Button 2 (Impressive) enabled: " + rb2.isEnabled());
        System.out.println("Radio Button 3 (No) enabled: " + rb3.isEnabled());

        // For enabled options, select and verify selection
        if (rb1.isEnabled()) {
            rb1.click();
            System.out.println("Radio Button 1 (Yes) selected successfully.");
            Thread.sleep(1000);
        }
        if (rb2.isEnabled()) {
            rb2.click();
            System.out.println("Radio Button 2 (Impressive) selected successfully.");
            Thread.sleep(1000);
        }
        if (rb3.isEnabled()) {
            rb3.click();
            System.out.println("Radio Button 3 (no) selected successfully.");

            Thread.sleep(1000);
        }

    }
    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Navigate to "https://demoqa.com/radio-button"
        driver.get("https://demoqa.com/radio-button");
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
