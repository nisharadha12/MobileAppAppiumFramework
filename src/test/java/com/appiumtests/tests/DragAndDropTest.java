package com.appiumtests.tests;

import com.appiumtests.pages.DragAndDropPage;
import com.appiumtests.pages.HomePage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {

    @Test
    public void checkDragAndDrop() {
        String message = new DragAndDropPage().navigateToDragAndDrop()
                        .performDragAndDrop().getSuccessMessage();
        Assertions.assertThat(message).isEqualTo("Dropped!");
    }
}
