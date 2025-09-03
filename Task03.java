package Tasks;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {
    public static void main(String[] args) throws InterruptedException {
//        Task3:
        WebDriver driver = new ChromeDriver();
//        Go to the Amazon URL : https://www.amazon.com/
        driver.get("https://www.amazon.com/");



//        Print the position and size of the page.
        int height =  driver.manage().window().getSize().height;
        int width =  driver.manage().window().getSize().width;
        System.out.println("height = " + height);
        System.out.println("width = " + width);

        int x = driver.manage().window().getPosition().x;
        int y = driver.manage().window().getPosition().y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        Thread.sleep(3000);

//        Adjust the position and size of the page as desired.
        driver.manage().window().setPosition(new Point(600, 10));
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(500, 945) );

//        Test that the page is in the position and size you want.
        int newheight =  driver.manage().window().getSize().height;
        int newwidth =  driver.manage().window().getSize().width;

        int newx = driver.manage().window().getPosition().x;
        int newy = driver.manage().window().getPosition().y;
        System.out.println("newheight = " + newheight);
        System.out.println("newwidth = " + newwidth);
        System.out.println("newx = " + newx);
        System.out.println("newy = " + newy);

        if (newheight == 945 && newwidth == 500 && newx == 600 && newy == 10) {
            System.out.println("Page Size and Position Test PASSED");
        } else {
            System.err.println("Page Size and Position Test FAILED");
        }



//        Close the page.
        driver.quit();


    }

}
