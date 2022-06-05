package com.example.personaldiary.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.personaldiary.R
import com.example.personaldiary.model.diary_entry

public class ItemAdapter(
    private val context: Context,
    private val dataset: List<diary_entry>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView1: TextView = view.findViewById(R.id.item_date)
        val textView2:TextView=view.findViewById(R.id.item_content)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView1.text =context.resources.getString(item.stringResourceId1)
        holder.textView2.text =context.resources.getString(item.stringResourceId2)
    }


    override fun getItemCount() = dataset.size
}