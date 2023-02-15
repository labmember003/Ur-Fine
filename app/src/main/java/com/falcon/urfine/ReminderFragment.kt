package com.falcon.urfine

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.falcon.urfine.databinding.FragmentReminderBinding


class ReminderFragment : Fragment() {
    private var _binding: FragmentReminderBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        val pillList = listOf("Flunil - 40", "Betacap - 20", "Novelcalm - 100", "Cogniphyx", "Obsace ER - 50")
        val pillTime = listOf("10:00am", "10:00am", "10:00am", "11:00pm", "11:00pm")
        val adapter = PillReminderListRcvAdapter(pillList, pillTime)
        binding.reminderList.adapter = adapter
        binding.reminderList.layoutManager = LinearLayoutManager(context)
        _binding = FragmentReminderBinding.inflate(inflater, container, false)
        return binding.root
    }

}