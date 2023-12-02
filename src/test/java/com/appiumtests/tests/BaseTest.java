package com.appiumtests.tests;

import com.appiumframework.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class BaseTest {
    @BeforeMethod
    public void setUpTest(Method m) throws MalformedURLException {
              Driver.initDriver();
    }
    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}
