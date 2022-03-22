package com.example.listview_gridview_tests.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listview_gridview_tests.R
import com.example.listview_gridview_tests.classes.TestClass
import com.squareup.picasso.Picasso

class RecyclerAdapter (private val context: Context, private val array: ArrayList<Int>, private val arrayText: ArrayList<String>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    public class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var listImage: ImageView = itemView.findViewById<ImageView>(R.id.list_image)
        var listText: TextView = itemView.findViewById<TextView>(R.id.list_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val convertView = LayoutInflater.from(context).inflate(R.layout.adapter_recycler, parent, false)
        val viewHolder = ViewHolder(convertView)
        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.get().load(array[position]).into(holder.listImage)
        holder.listText.text = arrayText[position]
    }

    override fun getItemCount(): Int {
        return array.size
    }
}