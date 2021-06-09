package com.abuzar.daftarfilm.ui.detail

import com.abuzar.daftarfilm.utils.DataDummy
import junit.framework.TestCase
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class DetailViewModelTest {
    private lateinit var viewModelMovie: DetailViewModel
    private lateinit var viewModelTvShow: DetailViewModel
    private val dummyMovie= DataDummy.generateDummyMovie()[0]
    private val movieId=dummyMovie.id


    private val dummyTvShow= DataDummy.generateDummyTvShow()[0]
    private val tvShowId=dummyTvShow.id

    @Before
    fun setUp(){
        viewModelMovie= DetailViewModel()
        viewModelMovie.setSelectedDataMovieAndTvShow(movieId)

        viewModelTvShow= DetailViewModel()
        viewModelTvShow.setSelectedDataMovieAndTvShow(tvShowId)
    }

    @Test
    fun getMovie(){
        viewModelMovie.setSelectedDataMovieAndTvShow(dummyMovie.id)
        val movieEntities=viewModelMovie.getMovie()
        TestCase.assertNotNull(movieEntities)
        assertEquals(dummyMovie.id,movieEntities.id)
        assertEquals(dummyMovie.title,movieEntities.title)
        assertEquals(dummyMovie.description,movieEntities.description)
        assertEquals(dummyMovie.releaseDate,movieEntities.releaseDate)
        assertEquals(dummyMovie.genre,movieEntities.genre)
        assertEquals(dummyMovie.imagePath,movieEntities.imagePath)
    }

    @Test
    fun getTvShow(){
        viewModelTvShow.setSelectedDataMovieAndTvShow(dummyTvShow.id)
        val tvShowEntities=viewModelTvShow.getTvShow()
        TestCase.assertNotNull(tvShowEntities)
        assertEquals(dummyTvShow.id,tvShowEntities.id)
        assertEquals(dummyTvShow.title,tvShowEntities.title)
        assertEquals(dummyTvShow.description,tvShowEntities.description)
        assertEquals(dummyTvShow.releaseDate,tvShowEntities.releaseDate)
        assertEquals(dummyTvShow.genre,tvShowEntities.genre)
        assertEquals(dummyTvShow.imagePath,tvShowEntities.imagePath)
    }

}