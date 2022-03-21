package com.example.listview_gridview_tests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ListView
import com.example.listview_gridview_tests.adapters.AdapterList

class GridActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        val gridView = findViewById<GridView>(R.id.grid_view)
        val array = ArrayList<String>()
        array.add("Carlos")
        array.add("Daniel")
        array.add("Felipe")
        array.add("João")
        array.add("Marcelo")
        array.add("Vitor")
        val arrayDrawable = ArrayList<Int>()
        arrayDrawable.add(R.drawable.image1)
        arrayDrawable.add(R.drawable.image2)
        arrayDrawable.add(R.drawable.image3)
        arrayDrawable.add(R.drawable.image4)
        arrayDrawable.add(R.drawable.image5)
        arrayDrawable.add(R.drawable.image6)
        val adapter = AdapterList(this, arrayDrawable, array)
        gridView.adapter = adapter
    }
}