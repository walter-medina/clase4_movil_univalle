package com.example.clase4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.clase4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        controller()
    }

    private fun controller(){
        binding.btnRelative.setOnClickListener {
            startActivity(Intent(this,RelativeLayout::class.java))
        }

        binding.btnConstraint.setOnClickListener {
            startActivity(Intent(this,ConstraintLayout::class.java))
        }

        binding.btnTable.setOnClickListener {
            startActivity(Intent(this,TableLayout::class.java))
        }

        binding.btnGrid.setOnClickListener {
            startActivity(Intent(this,GridLayout::class.java))
        }

    }
}