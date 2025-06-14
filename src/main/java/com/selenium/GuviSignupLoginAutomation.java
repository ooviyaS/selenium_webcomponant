package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviSignupLoginAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guvi.in/");

        // Dummy steps (adjust selectors as needed - site might use dynamic content)
        System.out.println("Launch site and perform signup/login manually for dynamic selectors");
        driver.quit();
    }
}