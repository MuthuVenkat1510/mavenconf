package org.junit;

import org.baseclass.BaseClass;
import org.pojo.LoginPojo;

public class IgnoreExample extends BaseClass {
	@Test
	public void tc1() {
		launchBrowser();

		loadUrl("https://www.facebook.com/login/");
		toMaximize();
		LoginPojo l = new LoginPojo();
		fillText(l.getTxtEmail(), "greens123@gmail.com");
		fillText(l.getTxtpass(), "Greens123");
		toClick(l.getBtnlogin());

	}

	@Test
	@Ignore
	public void tc2() {
		launchBrowser();

		loadUrl("https://www.facebook.com/login/");
		toMaximize();
		LoginPojo l = new LoginPojo();
		fillText(l.getTxtEmail(), "Selenium123@gmail.com");
		fillText(l.getTxtpass(), "Selenium123");
		toClick(l.getBtnlogin());

	}

	@Test

	public void tc3() {
		launchBrowser();

		loadUrl("https://www.facebook.com/login/");
		toMaximize();
		LoginPojo l = new LoginPojo();
		fillText(l.getTxtEmail(), "jiral123@gmail.com");
		fillText(l.getTxtpass(), "jiral123");
		toClick(l.getBtnlogin());

	}
}
