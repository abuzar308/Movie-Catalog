package com.abuzar.daftarfilm.ui.tvshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat.IntentBuilder.from
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.abuzar.daftarfilm.DataViewModel
import com.abuzar.daftarfilm.R
import com.abuzar.daftarfilm.data.DataEntity
import com.abuzar.daftarfilm.databinding.FragmentTvShowBinding

@Suppress("DEPRECATION")
class TvShowFragment : Fragment(), TvShowCallBack {
    private lateinit var fragmentTvShowBinding: FragmentTvShowBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        fragmentTvShowBinding = FragmentTvShowBinding.inflate(inflater, container,false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel= ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DataViewModel::class.java]
            val tvShow=viewModel.getTvShow()
            val adapter = TvShowAdapter(this)
            adapter.setTvShow(tvShow)
            with(fragmentTvShowBinding.rvTvshow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }

    override fun onShareClick(movie: DataEntity) {
        if (activity != null) {
            val mimeType = "text/plain"
            from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Bagikan Program Televisi ini....")
                .setText(resources.getString(R.string.share_text, movie.title))
                .startChooser()
        }
    }
}