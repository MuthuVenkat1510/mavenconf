package org.testng;

import java.util.Date;

import org.baseclass.BaseClass;
import org.pojo.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample extends BaseClass{
@BeforeClass
private void befClass() {
Date d = new Date();
System.out.println(d);

}
@AfterClass
private void atClass() {
Date d = new Date();

System.out.println(d);

}
@BeforeMethod
private void beMetho() {
launchBrowser();
loadUrl("https://www.facebook.com/");
toMaximize();
}
@AfterMethod
private void aftMethod() {
	toQuit();

}
@Test
private void tc1() {
	LoginPojo l = new LoginPojo();
	fillText(l.getTxtEmail(), "Ashik123@gmail.com");
	fillText(l.getTxtpass(), "asbyy");
	toClick(l.getBtnlogin());
}

@Test
private void tc3() {
	LoginPojo l = new LoginPojo();
	fillText(l.getTxtEmail(), "Abc123@gmail.com");
	fillText(l.getTxtpass(), "mnb");
	toClick(l.getBtnlogin());
}

@Test
private void tc2() {
	LoginPojo l = new LoginPojo();
	fillText(l.getTxtEmail(), "def123@gmail.com");
	fillText(l.getTxtpass(), "vcxz");
	toClick(l.getBtnlogin());
}
}
