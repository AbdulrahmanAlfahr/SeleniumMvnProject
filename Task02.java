package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
    public static void main(String[] args) throws InterruptedException {


        // Task2:
        WebDriver driver = new ChromeDriver();
//Open URL: https://www.google.com/
        driver.get("https://www.google.com/");
//Maximize the window.
        driver.manage().window().maximize();
//Print the position and size of the page.
        Thread.sleep(3000);
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
//Minimize the page.

        driver.manage().window().minimize();
//Wait 5 seconds in the icon state and maximize the page.
        Thread.sleep(5000);
//Print the position and dimensions of the page in maximized state.
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
//Make the page fullscreen.
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
//Close the Browser.
        Thread.sleep(3000);

        driver.quit();
    }
}