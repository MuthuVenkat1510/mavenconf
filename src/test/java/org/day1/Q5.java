package org.day1;

import java.io.IOException;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.HotelLogin;

public class Q5 extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		launchBrowser();
		toMaximize();
		loadUrl(" http://www.adactin.com/HotelApp/");
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
		writeexcel("sheet1", 5, 0, "Oderno = " + string);
		System.out.println(string);

		toQuit();
	}
}
