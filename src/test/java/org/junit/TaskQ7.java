package org.junit;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BaseClass;
import org.pojo.HotelLogin;

public class TaskQ7 extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass
	public static void afterClass() {
		Date d = new Date();
		System.out.println(d);
	}

	@Before
	public void before() {
		launchBrowser();
		toMaximize();
		loadUrl(" http://www.adactin.com/HotelApp/");
	}

	@After
	public void after() {
		toQuit();
	}

	@Test
	public void tc1() throws IOException, InterruptedException {
		HotelLogin hl = new HotelLogin();
		fillText(hl.getUsrname(), "Muthu1510");
		fillText(hl.getTxtpass(), "Kumar1510");
		toClick(hl.getBtnlgn());
		toSelectByIndex(hl.getLocationDropBox(), 1);
		toSelectByIndex(hl.getHotelDropBox(), 1);
		toSelectByIndex(hl.getRoomNoDropBox(), 1);
		toSelectByIndex(hl.getAdultRoomNoDropBox(), 2);
		toSelectByIndex(hl.getChildNoDropBox(), 1);
		toSelectByIndex(hl.getRoomTypeDropBox(), 1);
		toClick(hl.getSearchBtn());
		toClick(hl.getRadioBtn());
		toClick(hl.getCntbtn());
		toSelectByIndex(hl.getCcType(), 3);
		toSelectByIndex(hl.getCcMnth(), 1);
		toSelectByIndex(hl.getCcexpyear(), 5);

		fillText(hl.getFirstName(), excelRead(1, 0));
		fillText(hl.getLastName(), excelRead(1, 1));
		fillText(hl.getAddress(), excelRead(1, 2));
		fillText(hl.getCcnum(), excelRead(1, 3));
		fillText(hl.getCccvv(), excelRead(1, 4));
		toClick(hl.getBookBtn());
		Thread.sleep(7000);
		String string = togetattributevalue(hl.getOrderNo());
		writeexcel("Sheet1", 5, 0, string);
		System.out.println(string);
	}

	@Test
	public void tc2() throws IOException, InterruptedException {
		HotelLogin hl = new HotelLogin();
		fillText(hl.getUsrname(), "Muthu1510");
		fillText(hl.getTxtpass(), "Kumar1510");
		toClick(hl.getBtnlgn());
		toSelectByIndex(hl.getLocationDropBox(), 1);
		toSelectByIndex(hl.getHotelDropBox(), 1);
		toSelectByIndex(hl.getRoomNoDropBox(), 1);
		toSelectByIndex(hl.getAdultRoomNoDropBox(), 2);
		toSelectByIndex(hl.getChildNoDropBox(), 1);
		toSelectByIndex(hl.getRoomTypeDropBox(), 1);
		toClick(hl.getSearchBtn());
		toClick(hl.getRadioBtn());
		toClick(hl.getCntbtn());
		toSelectByIndex(hl.getCcType(), 3);
		toSelectByIndex(hl.getCcMnth(), 1);
		toSelectByIndex(hl.getCcexpyear(), 5);

		fillText(hl.getFirstName(), excelRead(2, 0));
		fillText(hl.getLastName(), excelRead(2, 1));
		fillText(hl.getAddress(), excelRead(2, 2));
		fillText(hl.getCcnum(), excelRead(2, 3));
		fillText(hl.getCccvv(), excelRead(2, 4));
		toClick(hl.getBookBtn());
		Thread.sleep(7000);
		String string = togetattributevalue(hl.getOrderNo());
		writeexcel("Sheet1", 6, 0, string);
		System.out.println(string);
	}

	@Test
	public void tc3() throws IOException, InterruptedException {
		HotelLogin hl = new HotelLogin();
		fillText(hl.getUsrname(), "Muthu1510");
		fillText(hl.getTxtpass(), "Kumar1510");
		toClick(hl.getBtnlgn());
		toSelectByIndex(hl.getLocationDropBox(), 1);
		toSelectByIndex(hl.getHotelDropBox(), 1);
		toSelectByIndex(hl.getRoomNoDropBox(), 1);
		toSelectByIndex(hl.getAdultRoomNoDropBox(), 2);
		toSelectByIndex(hl.getChildNoDropBox(), 1);
		toSelectByIndex(hl.getRoomTypeDropBox(), 1);
		toClick(hl.getSearchBtn());
		toClick(hl.getRadioBtn());
		toClick(hl.getCntbtn());
		toSelectByIndex(hl.getCcType(), 3);
		toSelectByIndex(hl.getCcMnth(), 1);
		toSelectByIndex(hl.getCcexpyear(), 5);

		fillText(hl.getFirstName(), excelRead(3, 0));
		fillText(hl.getLastName(), excelRead(3, 1));
		fillText(hl.getAddress(), excelRead(3, 2));
		fillText(hl.getCcnum(), excelRead(3, 3));
		fillText(hl.getCccvv(), excelRead(3, 4));
		toClick(hl.getBookBtn());
		Thread.sleep(7000);
		String string = togetattributevalue(hl.getOrderNo());
		writeexcel("Sheet1", 7, 0, string);
		System.out.println(string);
	}

	@Test
	public void tc4() throws IOException, InterruptedException {
		HotelLogin hl = new HotelLogin();
		fillText(hl.getUsrname(), "Muthu1510");
		fillText(hl.getTxtpass(), "Kumar1510");
		toClick(hl.getBtnlgn());
		toSelectByIndex(hl.getLocationDropBox(), 1);
		toSelectByIndex(hl.getHotelDropBox(), 1);
		toSelectByIndex(hl.getRoomNoDropBox(), 1);
		toSelectByIndex(hl.getAdultRoomNoDropBox(), 2);
		toSelectByIndex(hl.getChildNoDropBox(), 1);
		toSelectByIndex(hl.getRoomTypeDropBox(), 1);
		toClick(hl.getSearchBtn());
		toClick(hl.getRadioBtn());
		toClick(hl.getCntbtn());
		toSelectByIndex(hl.getCcType(), 3);
		toSelectByIndex(hl.getCcMnth(), 1);
		toSelectByIndex(hl.getCcexpyear(), 5);

		fillText(hl.getFirstName(), excelRead(4, 0));
		fillText(hl.getLastName(), excelRead(4, 1));
		fillText(hl.getAddress(), excelRead(4, 2));
		fillText(hl.getCcnum(), excelRead(4, 3));
		fillText(hl.getCccvv(), excelRead(4, 4));
		toClick(hl.getBookBtn());
		Thread.sleep(7000);
		String string = togetattributevalue(hl.getOrderNo());
		writeexcel("Sheet1", 8, 0, string);
		System.out.println(string);
	}
}
