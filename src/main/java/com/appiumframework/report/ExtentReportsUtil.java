package com.appiumframework.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.util.Objects;

public class ExtentReportsUtil {
    public static ExtentReports extent;


    public static void initReports(){
        if(Objects.isNull(ReportManager.getExtentText())){
            extent=new ExtentReports();
            ExtentSparkReporter spark= new ExtentSparkReporter(System.getProperty("user.dir")+"/index.html");
            extent.attachReporter(spark);
        }
    }

    public static void tearDownReports(){
        if(Objects.nonNull(ReportManager.getExtentText())){
            extent.flush();
            ReportManager.unloadTest();
        }
    }

    public static void createTest(String testcasename){
         ReportManager.setExtentTest(extent.createTest(testcasename));
    }
}
