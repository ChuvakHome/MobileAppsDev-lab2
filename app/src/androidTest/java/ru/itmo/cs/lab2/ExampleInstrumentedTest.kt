package ru.itmo.cs.lab2

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun clickButtonNextActivity() {
        ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.textView1)).check(matches(isDisplayed()))
        onView(withId(R.id.next_activity_button)).check(matches(isDisplayed()))
        onView(withId(R.id.next_activity_button)).perform(click())

        onView(withId(R.id.textView2)).check(matches(isDisplayed()))
        onView(withId(R.id.previous_activity_button)).check(matches(isDisplayed()))
    }

    @Test
    fun checkButtonPreviousActivity() {
        ActivityScenario.launch(MainActivity2::class.java)

        onView(withId(R.id.textView2)).check(matches(isDisplayed()))
        onView(withId(R.id.previous_activity_button)).check(matches(isDisplayed()))
        onView(withId(R.id.previous_activity_button)).perform(click())

        onView(withId(R.id.textView1)).check(matches(isDisplayed()))
        onView(withId(R.id.next_activity_button)).check(matches(isDisplayed()))
    }
}