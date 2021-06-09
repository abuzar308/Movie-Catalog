package com.abuzar.daftarfilm.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abuzar.daftarfilm.R
import com.abuzar.daftarfilm.data.DataEntity
import com.abuzar.daftarfilm.databinding.ItemsMovieBinding
import com.abuzar.daftarfilm.ui.detail.DetailMovieActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {


    private var listMovies=ArrayList<DataEntity>()

    fun setMovie(myMovie: List<DataEntity>){
        this.listMovies.clear()
        this.listMovies.addAll(myMovie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemMovieBinding=ItemsMovieBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  MovieViewHolder(itemMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie=listMovies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovies.size

    class MovieViewHolder(private val binding : ItemsMovieBinding) : RecyclerView.ViewHolder(binding.root){
        fun  bind(movie: DataEntity){
            with(binding){
                tvItemTitle.text=movie.title
                tvItemDate.text=itemView.resources.getString(R.string.release_date, movie.releaseDate)
                tvGenre.text=itemView.resources.getString(R.string.genreD, movie.genre)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_MOVIE, movie.id)
                    intent.putExtra(DetailMovieActivity.EXTRA_TYPE, "MOVIE")
                    itemView.context.startActivity(intent)
                }

                Glide.with(itemView.context)
                    .load(movie.imagePath)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(imgPoster)
            }
        }
    }
}