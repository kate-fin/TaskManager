package com.finek.android.core.ui

import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun InfoScreen(link: String) {
	AndroidView(factory = {
		WebView(it).apply {
			layoutParams = ViewGroup.LayoutParams(
				ViewGroup.LayoutParams.MATCH_PARENT,
				ViewGroup.LayoutParams.MATCH_PARENT
			)
			webViewClient = WebViewClient()
			settings.javaScriptEnabled = true
			loadUrl(link)
		}
	}, update = {
		it.loadUrl(link)
	})
}

@Preview
@Composable
private fun EmptyPreview() {
	InfoScreen(
		link = "https://www.android.com/"
	)
}