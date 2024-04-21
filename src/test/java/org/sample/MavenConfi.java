package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenConfi {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	WebElement txtMail = driver.findElement(By.id("email"));
	txtMail.sendKeys("muthu1455@gmail.com");
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("1234567");
	WebElement btnLog = driver.findElement(By.name("login"));
	btnLog.click();
	driver.quit();
}
}
