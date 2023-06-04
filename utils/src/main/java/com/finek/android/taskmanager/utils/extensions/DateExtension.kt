package com.finek.android.taskmanager.utils.extensions

import java.text.SimpleDateFormat
import java.util.*

fun Date.format(): String {
	val dateFormat =  SimpleDateFormat("EEEE yyyy.MM.dd HH:mm", Locale.US)
	return dateFormat.format(this)
}