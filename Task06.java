package SeleniumTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task06 {
    public static void main(String[] args) throws InterruptedException {

        // T06//:
        WebDriver driver = new ChromeDriver();

        // Go to the Amazon URL: https://www.amazon.com//
        driver.get("https://www.amazon.com/");


        //Verify that it writes "Performance Metrics" or " Gateway" from the Source code
        String pageSource = driver.getPageSource();





        Thread.sleep(1000);

    }
}