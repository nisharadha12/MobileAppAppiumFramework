package com.appiumframework.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

import static com.appiumframework.constants.FrameworkConstants.getApkfilePath;
import static com.appiumframework.driver.DriverManager.*;

public final class Driver {
    private Driver() { }

    public static void initDriver() throws MalformedURLException {

        if(Objects.isNull(getDriver())) {

                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(MobileCapabilityType.APP, getApkfilePath());
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                setDriver(new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));
            }
        }
        public static void quitDriver(){
        if(Objects.nonNull(getDriver())) {
            getDriver().quit();
            unload();
        }
    }
}
