package com.finek.android.taskmanager.features.auth

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable


const val authRoute = "auth"

fun NavController.navigateToAuth(navOptions: NavOptions? = null) {
	this.navigate(authRoute, navOptions)
}

fun NavGraphBuilder.authScreen() {
	composable(route = authRoute) {
		AuthScreen()
	}
}