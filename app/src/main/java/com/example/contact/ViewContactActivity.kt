package com.example.contact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class ViewContactActivity : AppCompatActivity() {
    lateinit var tvNamed:TextView
    lateinit var tvPhoneNo:TextView
    lateinit var tvemail2:TextView
    lateinit var tvimage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)

        tvNamed = findViewById(R.id.tvNamed)
        tvPhoneNo=findViewById(R.id.tvPhoneNo)
        tvemail2=findViewById(R.id.tvemail2)
        tvimage=findViewById(R.id.tvimage)

        var nameIntent = intent.getStringExtra("Name")
        tvNamed.text = nameIntent
        var phoneIntent=intent.getStringExtra("PhoneNumber")
        tvPhoneNo.text=phoneIntent
        var emailIntent=intent.getStringExtra("Email")
        tvemail2.text=emailIntent
        var imageIntent=intent.getStringExtra("img")
        Picasso.get().load(imageIntent).into(tvimage)



    }
}