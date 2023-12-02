package com.appiumtests.pages;

import com.appiumframework.driver.DriverManager;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage extends BasePage{

    @AndroidFindBy(id="io.appium.android.apis:id/drag_dot_1")
    private AndroidElement source;

    @AndroidFindBy(id="io.appium.android.apis:id/drag_dot_2")
    private AndroidElement target;
    @AndroidFindBy(id="io.appium.android.apis:id/drag_result_text")
    private AndroidElement labeldropped;

    public DragAndDropPage() {

    }
    public DragAndDropPage navigateToDragAndDrop() {
        new HomePage().clickOnViews().clickAMenuItem("Drag and Drop");
        return this;
    }
    public DragAndDropPage performDragAndDrop(){
        dragAndDrop(source,target);
        return this;
    }
    public String  getSuccessMessage(){
        return getText(labeldropped);
    }
}
