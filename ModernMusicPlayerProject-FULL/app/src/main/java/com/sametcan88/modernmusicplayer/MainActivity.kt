package com.sametcan88.modernmusicplayer

import android.app.*
import android.os.*
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Sametcan88 tarafından yapıldı", Toast.LENGTH_LONG).show()
    }
}
