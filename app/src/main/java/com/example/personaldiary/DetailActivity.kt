package com.example.personaldiary

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.personaldiary.data.Datasource
import com.example.personaldiary.model.diary_entry
import com.example.personaldiary.adapter.ItemAdapter


class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val button : Button =findViewById(R.id.button_detail)
        button.setOnClickListener{
            val detaildate = findViewById<EditText>(R.id.date_text)
            val date = detaildate.text.toString()
            val detailcontent = findViewById<EditText>(R.id.content_text)
            val content = detailcontent.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}