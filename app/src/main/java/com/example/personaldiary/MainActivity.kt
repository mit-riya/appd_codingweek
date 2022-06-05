package com.example.personaldiary

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.personaldiary.adapter.ItemAdapter
import com.example.personaldiary.data.Datasource


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = Datasource().loadEntry()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
        val addButton : Button =findViewById(R.id.button_main)
        addButton.setOnClickListener{
            val i = Intent(this, DetailActivity::class.java)
            startActivity(i)
        }
    }
}