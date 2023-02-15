package com.falcon.urfine

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.falcon.urfine.databinding.FragmentReminderBinding


class ReminderFragment : Fragment() {
    private var _binding: FragmentReminderBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReminderBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        val pillList = listOf("Flunil - 40", "Betacap - 20", "Novelcalm - 100", "Cogniphyx", "Obsace ER - 50")
        val pillTime = listOf("10:00am", "10:00am", "10:00am", "11:00pm", "11:00pm")
        val adapter = PillReminderListRcvAdapter(pillList, pillTime)
        binding.reminderList.adapter = adapter
        binding.reminderList.layoutManager = LinearLayoutManager(context)
        binding.floatingActionButton.setOnClickListener {
            showDialog()
        }
        return binding.root
    }
    private fun showColorDialog() {
        val dialogBuilder = AlertDialog.Builder(context)
        dialogBuilder.setTitle("Enter your name")
        dialogBuilder.setMessage("Please enter your name below:")
        val input = EditText(context)
        dialogBuilder.setView(input)
        dialogBuilder.setPositiveButton("OK") { dialog, whichButton ->
            val text = input.text.toString()
        }
        dialogBuilder.setNegativeButton("Cancel") { dialog, whichButton ->
            // Do nothing
        }
        val b = dialogBuilder.create()
        b.show()

    }
    private fun showDialog() {
        // First, create an instance of AlertDialog.Builder
        val dialogBuilder = AlertDialog.Builder(context)
        val dialogView = layoutInflater.inflate(R.layout.dialog_layout, null)
        dialogBuilder.setView(dialogView)
        dialogBuilder.setTitle("Add Reminder")
        val editText = dialogView.findViewById(R.id.et1) as EditText
        editText.hint = "Enter Medicine Name"
        dialogBuilder.setPositiveButton("OK") { dialog, whichButton ->
            val text = editText.text.toString()
        }
        dialogBuilder.setNegativeButton("Cancel") { dialog, whichButton ->

        }
        val b = dialogBuilder.create()
        b.show()
    }

}