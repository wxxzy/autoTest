package com.demo.test.pageshelper;

import com.demo.test.pages.BaiduPage;
import com.demo.test.utils.SeleniumUtil;
import org.apache.log4j.Logger;

public class BaiduPageHelper {
    //提供本类中日志输出对象
    public static Logger logger = Logger.getLogger(BaiduPageHelper.class);

    public static void waitBaiduPageLoad(SeleniumUtil seleniumUtil,int timeOut){
        seleniumUtil.pause(1000);
        //对此处的解释：这个登录页面有两个大frame，一个header一个body ,
        //而登录的用户名、密码输入框以及登录按钮都在body frame下的navbar frame下,
        //所以先要进入body frame中，然后在进入navbar frame中，才能查找到登录界面的相关元素
        logger.info("开始检查登录页面元素");
        seleniumUtil.waitForElementToLoad(timeOut, BaiduPage.KW);
        seleniumUtil.waitForElementToLoad(timeOut, BaiduPage.SU);
        logger.info("检查登录页面元素完毕");
    }

    public static void searchInfo(SeleniumUtil seleniumUtil,String kw){

        logger.info("开始输入登录信息");
        //清空用户名输入框
        seleniumUtil.clear(BaiduPage.KW);
        //输入用户名到用户名输入框
        seleniumUtil.type(BaiduPage.KW,kw);
        logger.info("输入登录信息完毕");
        //点击登录按钮
        seleniumUtil.click(BaiduPage.SU);


    }

    public static void checkErrorInfo(SeleniumUtil seleniumUtil,String error){
        //seleniumUtil.isTextCorrect(seleniumUtil.getText(LoginPage.LP_TEXT_ERROR), error);
    }


}
