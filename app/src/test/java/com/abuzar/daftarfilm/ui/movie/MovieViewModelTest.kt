package com.abuzar.daftarfilm.ui.movie

import com.abuzar.daftarfilm.DataViewModel
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class MovieViewModelTest {
    private lateinit var viewModel: DataViewModel

    @Before
    fun setUp() {
        viewModel = DataViewModel()
    }

    @Test
    fun getMovie() {
        val movieEntities = viewModel.getMovie()
        TestCase.assertNotNull(movieEntities)
        TestCase.assertEquals(10, movieEntities.size)
    }
}