package com.finek.android.taskmanager.features.auth

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation


const val authGraphRoute = "auth"
fun NavGraphBuilder.authGraph(navController: NavController) {
	navigation(startDestination = mainAuthRoute, route = authGraphRoute) {
		mainAuthScreen(
			onRegistryClick = {},
			onLogInClick = { navController.navigateToLogIn() }
		)
		logInScreen()
	}
}

private const val mainAuthRoute = "main_auth"

fun NavController.navigateToAuth(navOptions: NavOptions? = null) {
	this.navigate(mainAuthRoute, navOptions)
}

fun NavGraphBuilder.mainAuthScreen(
	onRegistryClick: () -> Unit,
	onLogInClick: () -> Unit
) {
	composable(route = mainAuthRoute) {
		MainAuthScreen(
			onRegistryClick = {},
			onLogInClick = onLogInClick
		)
	}
}

private const val logInRoute = "logIn"
fun NavGraphBuilder.logInScreen() {
	composable(route = logInRoute) {
		LogInScreen()
	}
}

fun NavController.navigateToLogIn(navOptions: NavOptions? = null) {
	this.navigate(logInRoute, navOptions)
}