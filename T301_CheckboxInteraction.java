package tasks;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class T301_CheckboxInteraction {

    @Test
    void CheckboxInteraction() throws InterruptedException {


        //Question
        //Go to "https://the-internet.herokuapp.com/checkboxes"
        driver.get("https://the-internet.herokuapp.com/checkboxes");


        //-Checks the current state of both checkboxes
        By checkBox1 = By.xpath("(//input[@type='checkbox'])[1]");
        By checkBox2 = By.xpath("(//input[@type='checkbox'])[2]");

        boolean isChecked1 = driver.findElement(checkBox1).isSelected();
        boolean isChecked2 = driver.findElement(checkBox2).isSelected();


        System.out.println("Checkbox 1 is selected: " + isChecked1);
        System.out.println("Checkbox 2 is selected: " + isChecked2);

        // -Ensures both checkboxes are selected (click only if not already selected)

        if (!isChecked1) {
            driver.findElement(checkBox1).click();
        }
        if (!isChecked2) {
            driver.findElement(checkBox2).click();
        }

        //-Verify both checkboxes are checked after the operations
        assertTrue(driver.findElement(checkBox1).isSelected());
        assertTrue(driver.findElement(checkBox1).isSelected());


        //-Print the status of each checkbox to console*/

        System.out.println("Checkbox 1 is selected: " + driver.findElement(checkBox1).isSelected());
        System.out.println("Checkbox 2 is selected: " + driver.findElement(checkBox2).isSelected());


    }
    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }



}
