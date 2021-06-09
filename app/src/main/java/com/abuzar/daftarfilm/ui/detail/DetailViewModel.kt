package com.abuzar.daftarfilm.ui.detail

import androidx.lifecycle.ViewModel
import com.abuzar.daftarfilm.data.DataEntity
import com.abuzar.daftarfilm.utils.DataDummy

class DetailViewModel: ViewModel() {
    private lateinit var id: String

    fun setSelectedDataMovieAndTvShow(id: String){
        this.id= id
    }

    fun getTvShow(): DataEntity{
        lateinit var tvShow: DataEntity
        val tvEntities=DataDummy.generateDummyTvShow()
        for (tvData in tvEntities) {
            if(tvData.id==id){
                tvShow=tvData
            }
        }
        return tvShow
    }

    fun getMovie(): DataEntity{
        lateinit var movie: DataEntity
        val movieEntities=DataDummy.generateDummyMovie()
        for (movieData in movieEntities) {
            if(movieData.id==id){
                movie=movieData
            }
        }
        return movie
    }
}