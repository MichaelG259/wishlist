package com.example.wishlist

import android.content.ActivityNotFoundException
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import android.net.Uri

class listadapter(private val items: List<Item>) : RecyclerView.Adapter<listadapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val shoppingView = inflater.inflate(R.layout.itemlayout, parent, false)
        // Return a new holder instance
        return ViewHolder(shoppingView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val item = items.get(position)
        // Set item views based on views and data model
        holder.nameview.text = item.itemname
        holder.urlview.text = item.itemurl
        holder.priceview.text = item.itemprice

    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameview: TextView
        val urlview: TextView
        val priceview: TextView
        init {
            nameview = itemView.findViewById(R.id.nameview)
            priceview = itemView.findViewById(R.id.priceview)
            urlview = itemView.findViewById(R.id.urlview)
        }
    }
}