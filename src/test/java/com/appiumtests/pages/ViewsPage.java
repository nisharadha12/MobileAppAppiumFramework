package com.appiumtests.pages;

import static com.appiumframework.utils.DynamicXpathUtils.getXpath;

public class ViewsPage extends BasePage {
    private String dragAndDrop="//android.widget.TextView[contains(@text,'%s')]";

    public void clickAMenuItem(String menuname){
        String xpath=getXpath(dragAndDrop,menuname);
        click("xpath",xpath,"Drag and Drop");
    }

}
