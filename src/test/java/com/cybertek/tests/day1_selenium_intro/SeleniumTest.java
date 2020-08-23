package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        //1- Setup the driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //3- Use the driver instance to test selenium
        driver.get("https://www.google.com");

        System.out.println("the title of the page is: " + driver.getTitle());

        String actualTitle = driver.getTitle();
        System.out.println("ACTUAL TITLE STRING: "+ actualTitle);

        String actualUrl = driver.getCurrentUrl();

        System.out.println("actualUrl = " + actualUrl);

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(3000);

        driver.navigate().to("https://facebook.com");

        String pageSource = driver.getPageSource();
        System.out.println("pageSource= " + pageSource);

        driver.close();




    }
}
