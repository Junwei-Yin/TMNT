package com.example.tmnt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        character_list.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
        }
    }

    fun radioButtonClick(view: View) {
        when(view) {
            radioButton_leo -> turtles.setImageResource(R.drawable.leonardo)
            radioButton_don -> turtles.setImageResource(R.drawable.donatello)
            radioButton_mike -> turtles.setImageResource(R.drawable.michelangelo)
            radioButton_raph -> turtles.setImageResource(R.drawable.raphael)
        }
    }
}
