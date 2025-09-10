package SeleniumTasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T401_CalculatorOperations {



    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.eviltester.com/styled/calculator");

    }
    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
    @Test
    void dynamicListManagementTest() throws InterruptedException {
        String[][] operations = {
                {"plus", "8", "4", "12"},
                {"minus", "8", "4", "4"},
                {"times", "8", "4", "32"},
                {"divide", "8", "4", "2"}
        };

        for (String[] op : operations) {
            // Re-locate elements fresh in each iteration
            WebElement number1 = driver.findElement(By.id("number1"));
            WebElement number2 = driver.findElement(By.id("number2"));
            WebElement operationSelect = driver.findElement(By.id("function"));
            WebElement calculateButton = driver.findElement(By.id("calculate"));

            // Clear and input values
            number1.clear();
            number1.sendKeys(op[1]);

            number2.clear();
            number2.sendKeys(op[2]);

            operationSelect.sendKeys(op[0]);
            calculateButton.click();

            // Wait briefly for result to update (optional but helpful)
            Thread.sleep(500); // Consider using WebDriverWait for better practice

            // Re-locate result element after click
            WebElement answer = driver.findElement(By.id("answer"));
            assertEquals(op[3], answer.getText().trim());
        }
    }


}
