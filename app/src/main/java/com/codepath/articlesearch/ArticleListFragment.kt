package com.codepath.articlesearch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codepath.asynchttpclient.BuildConfig

class ArticleListFragment : Fragment() {

    private val TAG = "ArticleListFragment"
    private val SEARCH_API_KEY = BuildConfig.API_KEY
    private val ARTICLE_SEARCH_URL =
        "https://api.nytimes.com/svc/search/v2/articlesearch.json?api-key=${SEARCH_API_KEY}"

    private val articles = mutableListOf<Article>()
    private lateinit var articlesRecyclerView: RecyclerView
    private lateinit var articleAdapter: ArticleAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_article_list, container, false)
    }

    companion object {
        fun newInstance(): ArticleListFragment {
            return ArticleListFragment()
        }
    }
}