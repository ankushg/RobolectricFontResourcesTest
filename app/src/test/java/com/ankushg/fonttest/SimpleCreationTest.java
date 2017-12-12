package com.ankushg.fonttest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

/**
 * Test cases to demonstrate Robolectric issues with Font resources. All this tries to do is create
 * our Activities and custom Button, without doing anything more complex.
 *
 */
@RunWith(RobolectricTestRunner.class)
public class SimpleCreationTest {
    /**
     * Button should be constructable
     *
     * Instead, this throws: android.content.res.Resources$NotFoundException
     */
    @Test
    public void testCustomButtonCreation() {
        new CustomButton(RuntimeEnvironment.application);
    }

    /**
     * CustomViewActivity should be able to be built/inflated/launched.
     *
     * Instead, this fails to inflate:
     * android.view.InflateException: XML file RobolectricFontResourcesTest/app/build/intermediates/merged-not-compiled-resources/debug/layout/activity_main_customview.xml line #-1 (sorry, not yet implemented): XML file RobolectricFontResourcesTest/app/build/intermediates/merged-not-compiled-resources/debug/layout/activity_main_customview.xml line #-1 (sorry, not yet implemented): Error inflating class com.ankushg.fonttest.CustomButton
     */
    @Test
    public void testCustomViewActivityLaunch() {
        Robolectric.buildActivity(CustomViewActivity.class)
                .setup()
                .get();
    }

    /**
     * FontReferenceActivity should be able to be built/inflated/launched.
     */
    @Test
    public void testFontReferenceActivityLaunch() {
        // This works!
        Robolectric.buildActivity(FontReferenceActivity.class)
                .setup()
                .get();
    }
}
