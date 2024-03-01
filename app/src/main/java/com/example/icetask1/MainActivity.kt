package com.example.icetask1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var button:Button
    private lateinit var button2:Button
    private lateinit var button3:Button
    private lateinit var button4:Button
    private lateinit var button5:Button
    private lateinit var text:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        android.os.Handler().postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()

            button = findViewById(R.id.button)
            button2 = findViewById(R.id.button2)
            button3 = findViewById(R.id.button3)
            button4 = findViewById(R.id.button4)
            button5 = findViewById(R.id.button5)
            text = findViewById(R.id.textView)

            button.setOnClickListener{
                var intent1 = Intent(this,Translator::class.java)
                startActivity(intent1)

                text.setText(R.string.HelloWorld)
            }

            button2.setOnClickListener{
                var intent2 = Intent(this,Translator::class.java)
                startActivity(intent2)

                text.setText(R.string.Namaste)
            }

            button3.setOnClickListener{
                var intent3 = Intent(this,Translator::class.java)
                startActivity(intent3)

                text.setText(R.string.Nihao)
            }

            button4.setOnClickListener{
                var intent4 = Intent(this,Translator::class.java)
                startActivity(intent4)

                text.setText(R.string.Hola)
            }

            button5.setOnClickListener{
                var intent5 = Intent(this,Translator::class.java)
                startActivity(intent5)

                text.setText(R.string.Ciao)
            }
        },3000)
    }
}