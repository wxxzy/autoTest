package com.demo.test.pageshelper;

import com.demo.test.pages.UploadPage;
import org.apache.log4j.Logger;
import com.demo.test.utils.SeleniumUtil;

import java.io.File;

public class UploadPageHelper {
    public static Logger logger=Logger.getLogger(UploadPageHelper.class);

    public static void waitUploadPageLoad(SeleniumUtil seleniumUtil,int timeOut){

        seleniumUtil.pause(1000);
        logger.info("开始检查我的文档列表页面元素");
       seleniumUtil.waitForElementToLoad(timeOut, UploadPage.UP_BUTTON_UPLOAD);
       /*  seleniumUtil.waitForElementToLoad(timeOut, LoginPage.LP_INPUT_PASSWORD);
        seleniumUtil.waitForElementToLoad(timeOut, LoginPage.LP_BUTTON_LOGIN);*/
        logger.info("检查我的文档列表页面元素完毕");
    }

    /**
     * 选择文件封装
     */
    public static void selectFile(SeleniumUtil seleniumUtil,String filePath){
        logger.info("开始输入登录信息");
        //点击上传文件按钮
       // File file = new File("E:\\测试开发班简介（第二期）.docx");
        seleniumUtil.click(UploadPage.UP_BUTTON_UPLOAD);
        seleniumUtil.type(UploadPage.UP_INPUT_SELECTFILE,filePath);
        // seleniumUtil.handleUpload("chrome",file);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        seleniumUtil.click(UploadPage.UP_DIV_UPLOAD);
    }
}
