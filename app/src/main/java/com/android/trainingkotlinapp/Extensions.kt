package com.android.trainingkotlinapp

import android.content.Context
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

fun Context.toast(text: CharSequence, length: Int = LENGTH_SHORT) {
    Toast.makeText(this, text, length).show()
}

