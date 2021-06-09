package com.abuzar.daftarfilm.ui.tvshow

import com.abuzar.daftarfilm.DataViewModel
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest {
    private lateinit var viewModel: DataViewModel

    @Before
    fun setUp() {
        viewModel = DataViewModel()
    }

    @Test
    fun getTvShow() {
        val tvShowEntities = viewModel.getTvShow()
        TestCase.assertNotNull(tvShowEntities)
        TestCase.assertEquals(10, tvShowEntities.size)
    }
}