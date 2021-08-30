package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class ItemAdapter(private val context: Context,
                  private val dataset: List<Affirmation>
                  ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    //Nested class
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    //Create new views, invoked by the layout manager
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //Create a new View
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    //Replaces the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceID)
    }

    //Returns the size of the dataset
    override fun getItemCount(): Int {
        return dataset.size
    }
}