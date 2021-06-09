package com.abuzar.daftarfilm

import androidx.lifecycle.ViewModel
import com.abuzar.daftarfilm.data.DataEntity
import com.abuzar.daftarfilm.utils.DataDummy

class DataViewModel: ViewModel() {
    fun getMovie(): List<DataEntity> = DataDummy.generateDummyMovie()
    fun getTvShow(): List<DataEntity> = DataDummy.generateDummyTvShow()
}