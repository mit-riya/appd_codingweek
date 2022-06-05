package com.example.personaldiary.data

import com.example.personaldiary.R
import com.example.personaldiary.model.diary_entry

class Datasource {

    fun loadEntry(): List<diary_entry> {
        var myList: List<diary_entry> = listOf<diary_entry>(
            diary_entry(R.string.entry1_date,R.string.entry1_content),
            diary_entry(R.string.entry2_date,R.string.entry2_content),
            diary_entry(R.string.entry3_date,R.string.entry3_content),
            diary_entry(R.string.entry4_date,R.string.entry4_content),
            diary_entry(R.string.entry5_date,R.string.entry5_content),
        )
        return myList
    }

}