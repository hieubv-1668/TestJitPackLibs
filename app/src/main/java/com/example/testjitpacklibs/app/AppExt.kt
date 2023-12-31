package com.example.testjitpacklibs.app

import android.content.Context
import android.widget.Toast

class AppExt {
    fun Context.appShortToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun Context.appLongToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
