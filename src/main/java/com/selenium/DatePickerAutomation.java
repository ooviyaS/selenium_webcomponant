package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");

        driver.switchTo().frame(0);
        WebElement dateInput = driver.findElement(By.id("datepicker"));
        dateInput.click();

        WebElement next = driver.findElement(By.className("ui-datepicker-next"));
        next.click();
        Thread.sleep(1000);

        WebElement date = driver.findElement(By.xpath("//a[text()='22']"));
        date.click();

        System.out.println("Selected Date: " + dateInput.getAttribute("value"));
        driver.quit();
    }
}