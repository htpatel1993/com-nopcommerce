package nopcommerstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTesting {
    public static void main(String[] args) {
        String BaseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        // Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the URL into Browser
        driver.get(BaseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the Title of the Page
        String title = driver.getTitle();
        System.out.println(title);

        // Get the Current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());

        // Get Page Source
        System.out.println("Page source :" + driver.getPageSource());

        // Find the Login link element

        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        //Click on login link element
        loginLink.click();

        //Find the Email Field Element
        WebElement emailField = driver.findElement(By.id("Email"));
        // Type the Email address to email field element
        emailField.sendKeys("htpatel1993@gmail.com");


        driver.findElement(By.name("Password")).sendKeys("Himanshu1234");


        // Close the Browser
        driver.close();
        driver.quit();
    }
}
