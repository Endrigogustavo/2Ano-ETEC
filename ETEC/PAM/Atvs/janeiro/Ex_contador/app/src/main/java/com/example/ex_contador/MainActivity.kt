package com.example.ex_contador

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Part.TEXT
import android.widget.Button
import android.widget.TextView
import org.xmlpull.v1.XmlPullParser.TEXT

class MainActivity : AppCompatActivity() {

        private val PREFS_NAME = "MyPrefsFile"
        private val COUNT_KEY = "count"
        private var count = 0

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val textView : TextView = findViewById(R.id.textView)
            val Button : Button = findViewById(R.id.button)

            // Carrega o valor do contador das preferências compartilhadas
            val prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

            count = prefs.getInt(COUNT_KEY, 0)

            // Atualiza a UI com o valor atual do contador


            // Configura o botão para incrementar o contador
            Button.setOnClickListener {
                count++
                textView.text = "Contador: $count"

                // Salva o valor atual do contador nas preferências compartilhadas
                val editor = prefs.edit()
                editor.putInt(COUNT_KEY, count)
                editor.apply()
            }
        }


    }

