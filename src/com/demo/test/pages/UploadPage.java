package com.demo.test.pages;

import org.openqa.selenium.By;

/**
 * 上传文件页面元素定位
 */
public class UploadPage {
    /*右上角导入按钮*/
    public static final By UP_BUTTON_UPLOAD=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[3]/button[2]");

    /*选择文件按钮*/
    public static final By UP_INPUT_SELECTFILE=By.xpath("//*[@id=\"filePicker\"]/div[2]/input");

    /*开始上传按钮*/
    public static final By UP_DIV_UPLOAD=By.xpath("//*[@id=\"uploader\"]/div[2]/div[3]/div[2]");
}
