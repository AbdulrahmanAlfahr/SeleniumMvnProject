package SeleniumTasks;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T304_FakerDataFormFilling {
@Test
    void fakerDataFormFillingTest(){
//    Go to "https://demoqa.com/text-box". Use Java Faker to:

//    Generate and enter a fake full name
    Faker faker = new Faker();
    String fullName = faker.name().fullName();
    driver.findElement(By.id("userName")).sendKeys(fullName);

//    Generate and enter a fake email address
driver.findElement(By.id("userEmail")).click();
driver.findElement(By.id("userEmail")).sendKeys(faker.internet().emailAddress());
//    Generate and enter a fake current address
driver.findElement(By.id("currentAddress")).click();
driver.findElement(By.id("currentAddress")).sendKeys(faker.address().fullAddress());
//    Generate and enter a fake permanent address
driver.findElement(By.id("permanentAddress")).click();
driver.findElement(By.id("permanentAddress")).sendKeys(faker.address().fullAddress());
//    Submit the form and verify the output contains the entered data
driver.findElement(By.className("btn-primary")).click();
    }

   WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");

    }
    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }












}
