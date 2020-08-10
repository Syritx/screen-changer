package com.syritx.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // loads scene 1

        val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            setContentView(R.layout.new_scene)
        }
    }
}
