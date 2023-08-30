package com.example.special

import android.content.Context
import android.widget.Toast

class SpecialExt {
    fun Context.specialShortToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun Context.specialLongToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
