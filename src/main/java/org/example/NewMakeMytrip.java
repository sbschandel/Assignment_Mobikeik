package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewMakeMytrip {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Shashi Bhushan\\Desktop\\chrome-win64\\chrome-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/flights/");

        // Enter mobile number
        WebElement mobileInput = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[1]/div/input"));
        mobileInput.sendKeys("8299309167");

        // Click the close button
        WebElement closeButton = driver.findElement(By.className("commonModal__close")); // Close button class name
        closeButton.click();

//        WebElement continueButton = driver.findElement(By.xpath("//button[@class='capText font16']\""));
//        continueButton.click();
//
//        continue button to become clickable
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='capText font16']")));
//
        // Click on continue button
//        continueButton.click();
//
        // Click on continue button
//        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button/span"));
//        continueButton.click();

        // Wait for OTP input to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));


        // Select the first option from the auto-suggestion dropdown
        WebElement fromOption = driver.findElement(By.xpath("//ul[@id='react-autowhatever-1']/li[1]"));
        fromOption.click();


        // Enter "Delhi" in the "From" field
        WebElement fromInput = driver.findElement(By.id("fromCity"));
        fromInput.sendKeys("Delhi");

        // Select the first option from the auto-suggestion dropdown
        WebElement toOption = driver.findElement(By.xpath("//ul[@id='react-autowhatever-1']/li[1]"));
        toOption.click();

        // Enter "Goa" in the "To" field
        WebElement toInput = driver.findElement(By.className("fsw_inputField lineHeight36 latoBlack font30"));
        toInput.sendKeys("Goa");

        // Select the first option from the auto-suggestion dropdown
//        WebElement toOption = driver.findElement(By.xpath("//ul[@id='react-autowhatever-1']/li[1]"));
//        toOption.click();

        // Click on the Departure date field
        WebElement departureDateInput = driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
        departureDateInput.click();

        // Select May from the calendar
        WebElement mayMonth = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'May')]"));
        mayMonth.click();

        // Click on the "Search" button
        WebElement searchButton = driver.findElement(By.xpath("//a[@data-cy='submit']"));
        searchButton.click();


    }
}
