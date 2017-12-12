package com.ankushg.fonttest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

/**
 * Test cases to demonstrate Robolectric issues with Font resources
 *
 * Created by ankushg on 12/12/17.
 */
@RunWith(RobolectricTestRunner.class)
public class ActivityCreationTest {

    @Test
    public void testCustomButtonCreation() {
        new CustomButton(RuntimeEnvironment.application);
    }

    @Test
    public void testCustomViewActivityLaunch() {
        Robolectric.buildActivity(MainCustomViewActivity.class)
                .setup()
                .get();
    }

    @Test
    public void testFontReferenceActivityLaunch() {
        Robolectric.buildActivity(MainFontReferenceActivity.class)
                .setup()
                .get();
    }
}
