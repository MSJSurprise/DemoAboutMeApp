package com.example.demoaboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var etNickname: EditText
    lateinit var btnDone: Button
    lateinit var tvNicknameResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNickname = findViewById(R.id.etNickname)
        btnDone = findViewById(R.id.btnDone)
        tvNicknameResult = findViewById(R.id.tvNicknameResult)

        btnDone.setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(view: View) {
//        val etNickname: EditText = findViewById(R.id.etNickname)
//        val btnDone: Button = findViewById(R.id.btnDone)
//        val tvNicknameResult: TextView = findViewById(R.id.tvNicknameResult)
        tvNicknameResult.text = etNickname.text
        btnDone.visibility = View.GONE
        etNickname.visibility = View.GONE
        tvNicknameResult.visibility = View.VISIBLE
    }
}