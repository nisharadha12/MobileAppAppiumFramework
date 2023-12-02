package com.appiumframework.driver;

import io.appium.java_client.android.AndroidDriver;

public final class DriverManager {
    private DriverManager(){}

    static ThreadLocal<AndroidDriver> threadlocalDriver=new ThreadLocal<>();

    public static AndroidDriver getDriver(){
        return threadlocalDriver.get();
    }
    public static void setDriver(AndroidDriver driver){
        threadlocalDriver.set(driver);
    }

    public static void unload(){
        threadlocalDriver.remove();
    }
}
