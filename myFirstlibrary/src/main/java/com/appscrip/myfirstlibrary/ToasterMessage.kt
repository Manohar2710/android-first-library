package com.appscrip.myfirstlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {
	public fun s(c: Context?, message: String?) {
		Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
	}
}
