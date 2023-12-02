package com.appiumtests.pages;

import com.appiumframework.driver.DriverManager;
import com.appiumframework.report.ExtentLogger;
import com.appiumframework.report.ReportManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected AppiumDriver<?> driver;

    public BasePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }
    protected String getText(MobileElement element){
        return element.getText();
    }
    protected void click(MobileElement element, String elementname){
        explicitWait(element);
        element.click();
        ReportManager.getExtentText().info("user clicked on "+elementname+"Option");
        ReportManager.getExtentText().pass(elementname+""+" Screen is validated successfully");
         }

    protected void click(By by, String element){
        click((AndroidElement) DriverManager.getDriver().findElement(by),element);
    }

    protected void click(String locatorType,String value,String elementName){
        if(locatorType.equalsIgnoreCase("xpath")){
            click(By.xpath(value),elementName);
        } else if (locatorType.equalsIgnoreCase("id")) {
            click((By.id(value)),elementName);
        }
    }

    protected void chooseItemAndClick(List<AndroidElement> mlist, String menu){
        MobileElement elemnt=  mlist.parallelStream()
                .filter(e->e.getText().contains(menu))
                .findFirst().get();
        click(elemnt,menu);

    }

    protected void dragAndDrop(AndroidElement source,AndroidElement target){
        new AndroidTouchAction((PerformsTouchActions) DriverManager.getDriver()).longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(ElementOption.element(target))
                .release()
                .perform();
            }

    private void explicitWait(MobileElement element){
        new WebDriverWait(DriverManager.getDriver(),5)
                .withMessage(()->"problem with finding element")
                .pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.visibilityOf(element));

    }
}
