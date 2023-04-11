package browser_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 *
 /**
 * Project-5 - Project Name: com-utimateqa BaseUrl = https://courses.ultimateqa.com/users/sign_in
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

public class MultiBrowserTest {
    static String browser = "Chrome";

    static  String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Egde")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name: ");
        }

        //open the URL into Browser
        driver.get(baseUrl);

        //maximise the Browser
        driver.manage().window().maximize();

        //we give implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get the Title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //get the Current page URL
        System.out.println("Current Page: " + driver.getCurrentUrl());

        //get the page source
        System.out.println("Page source: " + driver.getPageSource());

        //find the email field element
        WebElement email = driver.findElement(By.id("user[email]"));

        //type the email address to the email field
        email.sendKeys("bhreina@gmail.com");

        //find the password element, and type the password into password element
        driver.findElement(By.id("user[password]")).sendKeys("test123");

        //closing the Browser
        driver.close();

    }
}
