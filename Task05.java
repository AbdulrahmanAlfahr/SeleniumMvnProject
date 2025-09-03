package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task05 {
    public static void main(String[] args) throws InterruptedException {

        // Invoke Chrome Driver
        WebDriver driver = new ChromeDriver();

        // Navigate to Facebook homepage URL
        driver.get("https://www.facebook.com/");

        // Verify expected equals actual URL
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.facebook.com/";

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("URL is equals");
        } else {
            System.out.println("URL is unequal");
        }

        // Verify expected contains Facebook Word
        if (actualUrl.toLowerCase().contains("facebook")) {
            System.out.println("contains is correct");
        } else {
            System.out.println("Title is incorrect");
        }
        Thread.sleep(3000);
        driver.quit();
    }
} 