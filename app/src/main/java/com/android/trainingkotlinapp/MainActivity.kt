package com.android.trainingkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            toast(editText.text)
        }

        val items = listOf(Item("title 1", "url1"), Item("title 2", "url2"))

        val first = items.sortedBy(Item::title).filter { it.url.isNotBlank() }.first()
    }
}
