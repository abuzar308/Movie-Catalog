package com.abuzar.daftarfilm.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataEntity(
        var id: String,
        var title: String,
        var description: String,
        var releaseDate: String,
        var genre: String,
        var tvshow: Boolean = false,
        var imagePath: Int
): Parcelable
