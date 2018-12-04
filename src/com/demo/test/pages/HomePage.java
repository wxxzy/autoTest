package com.demo.test.pages;

import org.openqa.selenium.By;

/**
 * @author Young
 * @description 首页面元素定位声明
 * */
public class HomePage {
	
	/**用户名显示区域*/
	public static final By HP_TEXT_USERNAME= By.xpath("//*[@id=\"userinfo\"]/a/span[1]");
	/**Flights按钮*/
	public static final By HP_BUTTON_FLIGHTS = By.xpath("//*[@src='/WebTours/images/flights.gif']");
	/**Itinerary按钮*/
	public static final By HP_BUTTON_ITINERARY = By.xpath("//*[@src='/WebTours/images/itinerary.gif']");
	/**Home按钮*/
	public static final By HP_BUTTON_HOME = By.xpath("//*[@src='/WebTours/images/in_home.gif']");
	/**Sign Off按钮*/
	public static final By HP_BUTTON_SIGNOFF = By.xpath("//*[@src='/WebTours/images/signoff.gif']");
	/**首页完整文本*/
	public static final By HP_TEXT_HOME= By.xpath("//blockquote");

	/**需求模板菜单*/
	public static final By HP_DIV_MENU= By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div[2]/ul/li[3]/div/div");
	/**我的文档菜单*/
	public static final By HP_A_MYDOCMENU= By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div[2]/ul/li[3]/ul//li[2]/a");
	//public static final By HP_A_MYDOCMENU= By.xpath("//*[contains(@href, '#myword')]");
}
