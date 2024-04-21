package org.junit;

import org.baseclass.BaseClass;
import org.pojo.LoginPojo;

public class ExecutionSample extends BaseClass {

	@Test
	public void tc4() {
		launchBrowser();

		loadUrl("https://www.facebook.com/login/");
		toMaximize();
		LoginPojo l = new LoginPojo();
		fillText(l.getTxtEmail(), "pytho@gmail.com");
		fillText(l.getTxtpass(), "python123");
		toClick(l.getBtnlogin());

	}

	@Test
	@Ignore
	public void tc5() {
		launchBrowser();

		loadUrl("https://www.facebook.com/login/");
		toMaximize();
		LoginPojo l = new LoginPojo();
		fillText(l.getTxtEmail(), "java123@gmail.com");
		fillText(l.getTxtpass(), "java123");
		toClick(l.getBtnlogin());

	}

	@Test

	public void tc6() {
		launchBrowser();

		loadUrl("https://www.facebook.com/login/");
		toMaximize();
		LoginPojo l = new LoginPojo();
		fillText(l.getTxtEmail(), "photon23@gmail.com");
		fillText(l.getTxtpass(), "photon123");
		toClick(l.getBtnlogin());

	}

}
