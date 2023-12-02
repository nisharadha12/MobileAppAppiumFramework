package com.appiumframework.report;

import com.appiumframework.utils.ScreenshotUtils;
import com.aventstack.extentreports.MediaEntityBuilder;

public final class  ExtentLogger {

    private ExtentLogger() {
    }
    public static void pass(String message){
        ReportManager.getExtentText().pass(message);
    }
    public static void fail(String message){
            ReportManager.getExtentText().fail(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
    }
    public static void skip(String message){
        ReportManager.getExtentText().skip(message);
    }
    public static void info(String message){
        ReportManager.getExtentText().info(message);
    }
}
