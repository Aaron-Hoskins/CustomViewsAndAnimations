package com.examples.coding.customviewsandanimations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animation = AnimationUtils.loadAnimation(this,R.anim.circle_animation)
        cvMyCircle.animation = animation

    }

    fun onClick(view: View) {
        startActivity(Intent(this, Main2Activity::class.java))
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out)

    }
}
