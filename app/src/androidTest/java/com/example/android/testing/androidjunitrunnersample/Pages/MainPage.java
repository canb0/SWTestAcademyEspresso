package com.example.android.testing.androidjunitrunnersample.Pages;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.android.testing.androidjunitrunnersample.CalculatorActivity;
import com.example.android.testing.androidjunitrunnersample.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class MainPage {


    public MainPage(){


    }

    public void add(String first, String second,String expected){
        onView(withId(R.id.operand_one_edit_text)).perform(typeText(first));
        onView(withId(R.id.operand_two_edit_text)).perform(typeText(second));
        onView(withId(R.id.operation_add_btn)).perform(click());
        onView(withId(R.id.operation_result_text_view)).check(matches(withText(expected)));
    }

    public void substract(String first, String second,String expected){
        onView(withId(R.id.operand_one_edit_text)).perform(typeText(first));
        onView(withId(R.id.operand_two_edit_text)).perform(typeText(second));
        onView(withId(R.id.operation_sub_btn)).perform(click());
        onView(withId(R.id.operation_result_text_view)).check(matches(withText(expected)));
    }
}
