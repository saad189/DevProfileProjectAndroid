package com.example.devprofile

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Code for making the logo, rounded
        val bitmap = BitmapFactory.decodeResource(resources,R.drawable.devslopesprofilelogo)
        val roundedBitmap = RoundedBitmapDrawableFactory.create(resources,bitmap)
        roundedBitmap.cornerRadius = 15f
        //roundedBitmap.isCircular = true // will change it to a circle
        logo.setImageDrawable(roundedBitmap)
    }
}