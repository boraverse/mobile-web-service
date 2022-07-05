package com.example.kotlindasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //deklarasi variabel
        val bilangan : EditText
        val btnHasil : Button
        
        //mengisi variabel dari komponen pd xml
        bilangan = findViewById(R.id.etBilangan)
        btnHasil = findViewById(R.id.btnHasil)
        
        btnHasil.setOnClickListener(){
            if (bilangan.text.toString().toInt() % 2 == 0)
                Toast.makeText(this, "Genap", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "Ganjil", Toast.LENGTH_SHORT).show()
        }
    }
}