package com.cybertek.tests.AppliedAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    public class Britrix24_AC3_UserStory10 {

        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://login2.nextbasecrm.com/stream/?login=yes");
            driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("marketing2@cybertekschool.com");
            driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser");
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            driver.manage().window().maximize();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"feed-event-dest-cont\"]")).click();
            Thread.sleep(1000);
        }
    }

