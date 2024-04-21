package org.sample;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;

public class FaceBookPojo extends BaseClass {

	public static void main(String[] args) throws IOException {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		toMaximize();
		toTitle();
		toCurrentUrl();
		LoginPojo l = new LoginPojo();

		fillText(l.getTxtEmail(), "Muthu123@gmail.com");
		fillText(l.getTxtpass(), "Muthu123");
		toClick(l.getBtnlogin());

		// toQuit();
	}

}
