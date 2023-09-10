package com.example.recycler.data

import com.example.recycler.R
import com.example.recycler.model.Message

class DataSource {
    fun loadMessage(): List<Message> {
        return listOf(
            Message(R.string.affirmation1),
            Message(R.string.affirmation2),
            Message(R.string.affirmation3),
            Message(R.string.affirmation4),
            Message(R.string.affirmation5),
            Message(R.string.affirmation6),
            Message(R.string.affirmation7),
            Message(R.string.affirmation8),
            Message(R.string.affirmation9),
            Message(R.string.affirmation10),
        )
    }
}