package com.demo.test.pages;

import org.openqa.selenium.By;
/**
 * @author Young
 * @description 登录页面元素定位声明
 * */
public class LoginPage {
	/**用户名输入框*/
	public static final By LP_INPUT_USERNAME = By.id("username");
	
	/**密码输入框*/
	public static final By LP_INPUT_PASSWORD = By.id("password");
	
	/**登录按钮*/
	public static final By LP_BUTTON_LOGIN = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/form/div/div[3]/button");
	
	/**用户名或密码错误信息*/
	public static final By LP_TEXT_ERROR= By.xpath("/html/body/div[3]/div/span");

	/*用户名为空提示(用户名至少为 3 个字符)*/
	public static final By LP_TEXT_USER_ERROR= By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/form/div/div[1]/div/div/div[2]");

	/*密码为空提示(请填写密码)*/
	public static final By LP_TEXT_PWD_ERROR= By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/form/div/div[2]/div/div/div[2]");


}
