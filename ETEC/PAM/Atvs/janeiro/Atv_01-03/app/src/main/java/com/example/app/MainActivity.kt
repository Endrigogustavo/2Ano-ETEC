package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val end :EditText = findViewById(R.id.end)
        val bai :EditText = findViewById(R.id.bai)
        val cep :EditText = findViewById(R.id.cep)
        val cid :EditText = findViewById(R.id.cid)
        val est :EditText = findViewById(R.id.est)
        val btncadastar:Button = findViewById(R.id.cadastrar)
        btncadastar.setOnClickListener{

            val toast= Toast.makeText(this, end.text.toString()
                    +"\n" + bai.text.toString()
                    +"\n" + cep.text.toString()
                    +"\n" + cid.text.toString()
                    +"\n" + est.text.toString()
                    , Toast.LENGTH_SHORT)
            toast.show()
        }

    }
}


