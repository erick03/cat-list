package com.evasquez.mykotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myrecycler.layoutManager = GridLayoutManager(this, 2)
        myrecycler.adapter = ItemAdapter(getCatsList()){ item ->
            Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        }

    }
}
