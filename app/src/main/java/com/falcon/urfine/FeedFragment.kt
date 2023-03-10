package com.falcon.urfine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.falcon.urfine.databinding.FragmentFeedBinding


class FeedFragment : Fragment() {
    private var _binding: FragmentFeedBinding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFeedBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment

        val currentYear = arguments?.getInt("Year")
        return binding.root

    }
}