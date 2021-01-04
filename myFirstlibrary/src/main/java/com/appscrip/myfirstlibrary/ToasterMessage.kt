package com.appscrip.myfirstlibrary

import android.content.Context
import android.widget.Toast
import android.util.Log

class ToasterMessage {
	public fun s(c: Context?, message: String?) {
		Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
	}

	public fun testFunction() {
		Log.i("ToasterMessage","--->Called")
	}
}
