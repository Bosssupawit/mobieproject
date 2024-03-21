package com.example.mobieproject

import android.content.*
import android.os.*
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewproduct : Button = findViewById(R.id.btnViewProducts)
        viewproduct.setOnClickListener{
            startActivity(Intent(this, ProductListActivity::class.java))

        }

        val viewcart : Button = findViewById(R.id.btnViewCart)
        viewcart.setOnClickListener{
            startActivity(Intent(this, CartActivity::class.java))
        }

    }
}