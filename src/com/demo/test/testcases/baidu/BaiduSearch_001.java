package com.demo.test.testcases.baidu;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.BaiduPageHelper;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * @author wangxingxiang
 * @Description
 * @date 2018/12/5 15:42
 */
public class BaiduSearch_001 extends BaseParpare {

    @Test
    public void loginSuccessFunction() {
        //等待登录页面加载
        BaiduPageHelper.waitBaiduPageLoad(seleniumUtil, timeOut);
        // 输入登录信息
        BaiduPageHelper.searchInfo(seleniumUtil,"test");
        //等待首页元素显示出来
        //BaiduPageHelper.waitHomePageLoad(seleniumUtil, timeOut);
        //检查用户名是不是期望的"jojo"
        //BaiduPageHelper.checkUserName(seleniumUtil, timeOut, data.get("NAME"));
        System.out.println("=================");

    }
}
