package com.android.trainingkotlinapp

fun getItems(): List<Item> =
    (1..10).map { Item(it.toLong(), "Title $it", "http://lorempixel.com/400/400/cats/$it/") }


data class Item(val id: Long, val title:String, val url:String)
