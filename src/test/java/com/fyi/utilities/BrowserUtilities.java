package com.fyi.utilities;

import org.junit.Assert;

import java.util.Set;

public class BrowserUtilities {

    public static void verifyTitleContains(String expectedTitle) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }


    public static void switchWindowAndVerify(String expectedInUrl,String expectedMainTitle) {

        Set<String> windows = Driver.getDriver().getWindowHandles();
        for (String each : windows) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedMainTitle));


    }
}
