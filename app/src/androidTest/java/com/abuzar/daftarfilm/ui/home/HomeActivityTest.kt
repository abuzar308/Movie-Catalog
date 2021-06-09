package com.abuzar.daftarfilm.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.abuzar.daftarfilm.R
import com.abuzar.daftarfilm.utils.DataDummy
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {
    private val dummyMovie = DataDummy.generateDummyMovie()
    private val dummyTvShow = DataDummy.generateDummyTvShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.rv_movie))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.rv_movie))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadTvShow() {
        onView(withText("TV SHOW")).perform(ViewActions.click())
        onView(withId(R.id.rv_tvshow))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                ViewActions.click()
            )
        )
        onView(withId(R.id.image_poster))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_title))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_title))
            .check(ViewAssertions.matches(withText(dummyMovie[0].title)))
        onView(withId(R.id.text_date))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_date))
            .check(ViewAssertions.matches(withText("Release Date ${dummyMovie[0].releaseDate}")))

        onView(withId(R.id.text_desc))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_desc))
                .check(ViewAssertions.matches(withText("Kilasan Singkat")))

        onView(withId(R.id.text_description))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_description))
                .check(ViewAssertions.matches(withText(dummyMovie[0].description)))
    }

    @Test
    fun loadDetailTvShow() {
        onView(withText("TV SHOW")).perform(ViewActions.click())
        onView(withId(R.id.rv_tvshow))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.rv_tvshow)).perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                        0,
                        ViewActions.click()
                )
        )
        onView(withId(R.id.image_poster))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_title))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_title))
                .check(ViewAssertions.matches(withText(dummyTvShow[0].title)))
        onView(withId(R.id.text_date))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_date))
                .check(ViewAssertions.matches(withText("Release Date ${dummyTvShow[0].releaseDate}")))

        onView(withId(R.id.text_desc))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_desc))
                .check(ViewAssertions.matches(withText("Kilasan Singkat")))

        onView(withId(R.id.text_description))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_description))
                .check(ViewAssertions.matches(withText(dummyTvShow[0].description)))
    }

}