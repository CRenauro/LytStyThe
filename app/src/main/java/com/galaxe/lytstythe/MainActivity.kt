package com.galaxe.lytstythe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var courses:TextView
    lateinit var exams:TextView
    lateinit var freelance:TextView
    lateinit var info: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        info = findViewById(R.id.info)
//

//        exams.setOnClickListener { info.text }
//        courses.setOnClickListener()
//        freelance.setOnClickListener()

    }

    fun courses(view: View){
        info.text = "Android Application Development"
    }

    fun exams(view: View){
        info.text = "Android Security Essentials"
    }

    fun freelance(view: View){
        info.text = "Monetize Android Applications"
    }


}
