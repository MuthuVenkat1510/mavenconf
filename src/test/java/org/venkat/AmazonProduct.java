package org.venkat;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonProduct {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement srchTxt = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		srchTxt.sendKeys("Moblie 5G");

		WebElement srchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		srchbtn.click();

		List<WebElement> mobName = driver
				.findElements(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]"));
		
		System.out.println(mobName.size());

		List<WebElement> mobPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		System.out.println(mobPrice.size());

		List<Object> li = new LinkedList<Object>();

		for (int i = 0; i < mobName.size(); i++) {

			String mob = mobName.get(i).getText();

			String[] split = mob.split(" ");

			for (String string : split) {

				li.add(string);

				break;
			}
		}

		List<Object> li1 = new LinkedList<Object>();

		for (int j = 3; j < mobPrice.size(); j++) {

			String price = mobPrice.get(j).getText();

			li1.add(price);

		}

		Map<Object, Object> mp = new LinkedHashMap<>();

		Set<Entry<Object, Object>> en = mp.entrySet();

		for (int i = 0; i < li.size(); i++) {

			mp.put(li.get(i), li1.get(i));
		}

		System.out.println(mp);

	}

}
