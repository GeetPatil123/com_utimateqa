package browser_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

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
public class ChromeBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        WebDriver driver = new ChromeDriver(); //launch the Chrome Browser
        driver.get(baseUrl);// open the URL into the Browser

        //maximise the Browser
        driver.manage().window().maximize();

        //we give implicit wait to the Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get the Title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //get the Current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //get page source
        System.out.println("Page source: " + driver.getPageSource());

        //find email field element
        WebElement email = driver.findElement(By.id("user[email]"));

        //type email into email field element
        email.sendKeys("bhreina@gmail.com");

        //find the password element, and type the password into password element
        driver.findElement(By.id("user[password]")).sendKeys("test123");

        //closing the Browser
        driver.close();
    }
}
