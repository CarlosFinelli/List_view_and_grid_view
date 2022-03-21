package com.example.listview_gridview_tests.adapters

import android.content.Context
import android.graphics.drawable.Drawable
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.listview_gridview_tests.R
import com.squareup.picasso.Picasso

class AdapterList (private val context: Context, private val array: ArrayList<Int>, private val arrayText: ArrayList<String>) :
BaseAdapter(){
    override fun getCount(): Int {
        return array.size
    }

    override fun getItem(position: Int): Any {
        return array[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val convertView = LayoutInflater.from(context).inflate(R.layout.adapter_list, parent, false)
        val image = convertView.findViewById<ImageView>(R.id.list_image)
        val text = convertView.findViewById<TextView>(R.id.list_text)
        Picasso.get().load(array[position]).fit().into(image)
        text.text = arrayText[position]
        return convertView
    }
}