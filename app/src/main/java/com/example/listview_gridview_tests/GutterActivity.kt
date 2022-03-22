package com.example.listview_gridview_tests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ListView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.listview_gridview_tests.adapters.AdapterList
import com.example.listview_gridview_tests.adapters.RecyclerAdapter
import com.example.listview_gridview_tests.classes.TestClass

class GutterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gutter)

        val arrayClass = ArrayList<TestClass>()
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
        for (i in 0 until arrayDrawable.size) {
            val test = TestClass()
            test.image = arrayDrawable[i]
            test.nome = array[i]
            arrayClass.add(test)
        }
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = RecyclerAdapter(this, arrayDrawable, array)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
    }
}