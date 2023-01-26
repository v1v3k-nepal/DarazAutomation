package com.test.Src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DarazTest{

    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vivek Nepal\\Desktop\\Selenium\\com\\test\\Src\\driver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.daraz.com.np");
            WebElement searchBox = driver.findElement(By.id("q"));
            searchBox.sendKeys("Neckbands");
            searchBox.submit();
    }
} 