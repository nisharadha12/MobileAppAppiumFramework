package com.appiumframework.report;

import com.aventstack.extentreports.ExtentTest;

public final class ReportManager {
    private ReportManager() {
    }
    private static ThreadLocal<ExtentTest> test=new ThreadLocal<>();

    public static ExtentTest getExtentText(){
        return test.get();
    }

    public static void setExtentTest(ExtentTest extenttest){
        test.set(extenttest);
    }
    public  static void unloadTest(){
        test.remove();
    }
}
