package com.layout.userdetails

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import java.util.jar.Attributes.Name

class UserDetailsReceived : AppCompatActivity() {
    lateinit var tvNameU:TextView
    lateinit var tvNameUR:TextView
    private lateinit var tvclassU:TextView
    lateinit var tvClassUR:TextView
    private lateinit var tvaboutU:TextView
    private lateinit var tvaboutUR:TextView


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details_received)
        tvNameU=findViewById(R.id.tvNameU)
        tvNameUR=findViewById(R.id.tvNameUR)
        tvaboutU=findViewById(R.id.tvaboutU)
        tvclassU=findViewById(R.id.tvclassU)
        tvaboutUR=findViewById(R.id.tvaboutUR)
        tvClassUR=findViewById(R.id.tvClassUR)
//        tvNameUR.setOnClickListener{
           intent?.let {
             val name=intent.getStringExtra("UrName")
               tvNameUR.text=name

               var About=intent.getStringExtra("UrAbout")
               tvaboutUR.text=About
               var Class=intent.getStringExtra("UrClass")
               tvClassUR.text=Class





            }

        }
//}
 }














