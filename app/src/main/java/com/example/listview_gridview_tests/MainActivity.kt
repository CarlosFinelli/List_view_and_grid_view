package com.example.listview_gridview_tests

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnList = findViewById<Button>(R.id.button_list)
        val btnGrid = findViewById<Button>(R.id.button_grid)
        val btnGutter = findViewById<Button>(R.id.button_gutter)

        btnList.setOnClickListener {
            startActivity(Intent(baseContext, ListViewActivity::class.java))
        }

        btnGrid.setOnClickListener {
            startActivity(Intent(baseContext, GridActivity::class.java))
        }

        btnGutter.setOnClickListener {
            startActivity(Intent(baseContext, GutterActivity::class.java))
        }
    }
}