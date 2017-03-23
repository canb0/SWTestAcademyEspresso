package com.example.android.testing.androidjunitrunnersample;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.android.testing.androidjunitrunnersample.Pages.MainPage;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.action.ViewActions.typeTextIntoFocusedView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Canberk on 9/6/2016.
 */
@RunWith(AndroidJUnit4.class)
@android.test.suitebuilder.annotation.LargeTest
public class CanberkTest {

    MainPage m_page;
    @Rule
    public ActivityTestRule<CalculatorActivity> activiyObj = new ActivityTestRule<CalculatorActivity>(CalculatorActivity.class);

    @Before
    public void BeforeTest(){

        m_page = new MainPage();
    }
    @Test
    public void addingTest(){
       m_page.add("32.0", "16.0", "48.0");

    }

    @Test
    public void substractTest(){
        m_page.substract("32.0", "16.0", "16.0");

    }
}
