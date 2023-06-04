package com.finek.android.core.ui

import android.net.Uri
import androidx.navigation.*
import androidx.navigation.compose.composable
import java.net.URLDecoder
import java.net.URLEncoder
import java.nio.charset.StandardCharsets


const val infoUrlKey = "url"
fun coreInfoRoute(url: String) = "info/$url"

fun NavController.navigateToInfo(url: String, navOptions: NavOptions? = null) {
	val encodedUrl = URLEncoder.encode(url, StandardCharsets.UTF_8.toString())
	this.navigate(coreInfoRoute(encodedUrl), navOptions)
}

fun NavGraphBuilder.infoScreen() {
	composable(
		route = coreInfoRoute("{$infoUrlKey}"),
		arguments = listOf(
			navArgument(infoUrlKey) {
				type = NavType.StringType
				nullable = false
			}
		)
	) {
		val arguments = requireNotNull(it.arguments)
		val encodedUrl = arguments.getString(infoUrlKey).orEmpty()
		val url = URLDecoder.decode(encodedUrl, StandardCharsets.UTF_8.toString())
		InfoScreen(url)
	}
}