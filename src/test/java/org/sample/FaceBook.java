package org.sample;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook extends BaseClass {

	public static void main(String[] args) throws IOException {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		toMaximize();
		toTitle();
		toCurrentUrl();
		WebElement txtMail = driver.findElement(By.id("email"));
		fillText(txtMail, excelRead(0, 0));
		WebElement txtPass = driver.findElement(By.id("pass"));
		fillText(txtPass, excelRead(0, 0));
		WebElement btnLog = driver.findElement(By.name("login"));
		toClick(btnLog);
		toQuit();
	}

}
