package com.demo.test.testcases.upload;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.UploadPageHelper;
import org.testng.annotations.Test;

public class UploadFile_001 extends BaseParpare {
    @Test
    public void uploadWordFunction(){
        //等待登录页面加载
        UploadPageHelper.waitUploadPageLoad(seleniumUtil, timeOut);
        String path="E:\\测试开发班简介（第二期）.docx";
        UploadPageHelper.selectFile(seleniumUtil,path);

    }

}
