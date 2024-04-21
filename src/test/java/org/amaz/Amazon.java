package org.amaz;

import java.util.HashMap;
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

public class Amazon {
public static void main (String[]args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement srchTxt = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	srchTxt.sendKeys("Moblie 5G");
	WebElement srchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	srchbtn.click();
	List<WebElement> nameList = driver.findElements(By.xpath("//h2//a//span[text()]"));
	List <Object> li = new LinkedList<Object>();
	
	for (int i = 0; i < 11; i++) {
		String text = nameList.get(i).getText();
		String[] split = text.split(" ");
		for (String string : split) {
			li.add(string);
			//System.out.println(string);
			break;
		}
	}
	List<WebElement> nameList2 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	List <Object> li1 = new LinkedList<Object>();
	for (int j = 0; j < 11; j++) {
		li1.add( nameList2.get(j).getText());
		//System.out.println(nameList2.get(j).getText());
	}
	
	Map <Object,Object> mp = new TreeMap<Object, Object>();
	for (int i = 0; i < li.size(); i++) {
		mp.put(li.get(i), li1.get(i));
	}
	
	Set<Entry<Object, Object>> entrySet = mp.entrySet();
	for (Entry<Object, Object> entry : entrySet) {
		
		
		System.out.println("Name of Moblie  "+entry.getKey()+"  Price  "+ entry.getValue());
	}
	System.out.println(mp);
}
}
