package com.abuzar.daftarfilm.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.abuzar.daftarfilm.R
import com.abuzar.daftarfilm.data.DataEntity
import com.abuzar.daftarfilm.databinding.ActivityDetailMovieBinding
import com.abuzar.daftarfilm.databinding.ContentDetailMovieBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

class DetailMovieActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_TYPE = "extra_type"
    }
    private lateinit var detailContentBinding: ContentDetailMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailMovieBinding=ActivityDetailMovieBinding.inflate(layoutInflater)
        detailContentBinding=activityDetailMovieBinding.detailContent

        setContentView(activityDetailMovieBinding.root)
        setSupportActionBar(activityDetailMovieBinding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel= ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val dataId = extras.getString(EXTRA_MOVIE)
            val typeData=extras.getString(EXTRA_TYPE)

            if (typeData.equals("MOVIE",ignoreCase = true)){
                dataId?.let{
                    viewModel.setSelectedDataMovieAndTvShow(it)
                }
                populateDataMovieAndTvShow(viewModel.getMovie())
            }else if (typeData.equals("TVSHOW", ignoreCase = true)){
                dataId?.let {
                    viewModel.setSelectedDataMovieAndTvShow(it)
                }
                populateDataMovieAndTvShow(viewModel.getTvShow())
            }

        }
    }

    private fun populateDataMovieAndTvShow(dataEntity: DataEntity) {
        detailContentBinding.textTitle.text = dataEntity.title
        detailContentBinding.textDescription.text = dataEntity.description
        detailContentBinding.textDate.text = resources.getString(R.string.release_date, dataEntity.releaseDate)

        Glide.with(this)
                .load(dataEntity.imagePath)
                .transform(RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_error))
                .into(detailContentBinding.imagePoster)

    }


}