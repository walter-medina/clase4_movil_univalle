package com.example.clase4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class GridLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)
    }

    fun onGridItemClick(view: View) {
        val tag = view.tag.toString()
        Toast.makeText(this, "Clic en $tag", Toast.LENGTH_SHORT).show()
        // Realiza las acciones que desees para este elemento
    }
}