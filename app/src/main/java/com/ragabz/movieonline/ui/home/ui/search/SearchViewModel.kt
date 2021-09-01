package com.ragabz.movieonline.ui.home.ui.search

import androidx.lifecycle.ViewModel
import com.ragabz.movieonline.models.RecommendedMovie

class SearchViewModel : ViewModel() {

    lateinit var recommendedList: List<RecommendedMovie>
    lateinit var repository: IMovieRepository

    fun getRecommendation() {
        recommendedList = repository.getRecommendedList()
    }
}