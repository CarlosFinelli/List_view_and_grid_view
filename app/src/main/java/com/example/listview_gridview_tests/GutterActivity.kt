package com.example.listview_gridview_tests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class GutterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gutter)

        val grid = findViewById<GridView>(R.id.grid_gutter)
    }
}