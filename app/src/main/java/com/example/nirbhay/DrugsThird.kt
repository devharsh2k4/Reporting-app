package com.example.nirbhay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_drugs_third.*

class DrugsThird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drugs_third)

        buttonSubmit.setOnClickListener {
            val i = Intent(this,Done::class.java).also{
                startActivity(it)
            }
        }
    }
}