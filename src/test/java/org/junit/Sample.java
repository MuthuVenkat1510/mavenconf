package org.junit;

import java.util.Date;

import org.baseclass.BaseClass;
import org.pojo.LoginPojo;

public class Sample extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		Date d = (Date) new java.util.Date();
		System.out.println(d);
	}

	@AfterClass
	public static void afterClass() {
		Date d = new Date();
		System.out.println(d);

	}

	@Before
	public void brfore() {
		launchBrowser();
		loadUrl("https://www.facebook.com/login/");
		toMaximize();
	}

	@After
	public void after() {
		toQuit();
	}

	@Test
	public void tc1() {
		LoginPojo l = new LoginPojo();
		fillText(l.getTxtEmail(), "Muthukumar123@gmail.com");
		fillText(l.getTxtpass(), "Greens123");
		toClick(l.getBtnlogin());
	}

	@Test
	public void tc2() {
		LoginPojo l = new LoginPojo();
		fillText(l.getTxtEmail(), "kumar122@gmail.com");
		fillText(l.getTxtpass(), "kumar123");
		toClick(l.getBtnlogin());

	}

	@Test
	public void tc3() {
		LoginPojo l = new LoginPojo();
		fillText(l.getTxtEmail(), "abcrty123@gmail.com");
		fillText(l.getTxtpass(), "qrwtyebfh1526");
		toClick(l.getBtnlogin());
	}
}
