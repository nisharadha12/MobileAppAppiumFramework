package com.appiumframework.listeners;

import com.appiumframework.report.ExtentLogger;
import com.appiumframework.report.ExtentReportsUtil;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener, ISuiteListener {
    public void onTestStart(ITestResult result) {
        ExtentReportsUtil.createTest(result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getName()+" is passed");
    }

    public void onTestFailure(ITestResult result) {

        ExtentLogger.fail(result.getName()+"is failed");
    }

    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getName()+"is skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // not implemented
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        onTestFailure(result);
    }

    public void onStart(ITestContext context) {
        ExtentReportsUtil.initReports();
    }

    public void onFinish(ITestContext context) {
        ExtentReportsUtil.tearDownReports();
    }
}
