package com.abuzar.daftarfilm.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abuzar.daftarfilm.R
import com.abuzar.daftarfilm.data.DataEntity
import com.abuzar.daftarfilm.databinding.ItemsTvshowBinding
import com.abuzar.daftarfilm.ui.detail.DetailMovieActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class TvShowAdapter(private val callback: TvShowCallBack) : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {

    private val listTvShow = ArrayList<DataEntity>()

    fun setTvShow(tvshow: List<DataEntity>) {
        this.listTvShow.clear()
        this.listTvShow.addAll(tvshow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemsTvShowBinding = ItemsTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemsTvShowBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvshow = listTvShow[position]
        holder.bind(tvshow)
    }

    override fun getItemCount(): Int = listTvShow.size

    inner class TvShowViewHolder(private val binding: ItemsTvshowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvshow: DataEntity) {
            with(binding) {
                tvItemTitle.text = tvshow.title
                tvItemDate.text = itemView.resources.getString(R.string.release_date, tvshow.releaseDate)
                tvGenre.text=itemView.resources.getString(R.string.genreD, tvshow.genre)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_MOVIE, tvshow.id)
                    intent.putExtra(DetailMovieActivity.EXTRA_TYPE, "TVSHOW")
                    itemView.context.startActivity(intent)
                }
                imgShare.setOnClickListener { callback.onShareClick(tvshow) }
                Glide.with(itemView.context)
                    .load(tvshow.imagePath)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(imgPoster)
            }
        }
    }
}

interface TvShowCallBack {
    fun onShareClick(movie: DataEntity)
}