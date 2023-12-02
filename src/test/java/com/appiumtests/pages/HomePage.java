package com.appiumtests.pages;

import com.appiumframework.driver.DriverManager;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


import java.util.List;

public class HomePage extends BasePage{
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Views')]")
    private AndroidElement views;
    @AndroidFindBy(xpath="//android.widget.TextView")
    List<AndroidElement> menuList;

    public HomePage()
    {
        }

    public ViewsPage clickOnViews(){
         click(views,"Views");
        return new ViewsPage();
    }
    public void clickMenuItem(String menu) {
        chooseItemAndClick(menuList, menu);
    }
}
