package com.example.listview_gridview_tests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ListView
import com.example.listview_gridview_tests.adapters.AdapterList

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val list = findViewById<ListView>(R.id.list_test)
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
        list.adapter = adapter
    }
}