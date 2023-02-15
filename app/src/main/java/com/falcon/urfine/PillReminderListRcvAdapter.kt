package com.falcon.urfine

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class PillReminderListRcvAdapter(private val pills: List<String>, private val pillTime: List<String>): Adapter<PillReminderListRcvAdapter.myViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view, parent, false)
        return myViewHolder(view)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.pillName.text = pills[position]
        holder.pillTime.text = pillTime[position]
    }

    override fun getItemCount(): Int {
        return pills.size
    }
    class myViewHolder(itemView: View): ViewHolder(itemView) {
        val pillName = itemView.findViewById<TextView>(R.id.pillName)
        val pillTime = itemView.findViewById<TextView>(R.id.pillTime)
    }

}
