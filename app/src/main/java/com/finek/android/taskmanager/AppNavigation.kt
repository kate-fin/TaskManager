package com.finek.android.taskmanager

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.finek.android.taskmanager.features.auth.authRoute
import com.finek.android.taskmanager.features.auth.authScreen

@Composable
fun AppNavigation(
	navController: NavHostController,
) {
	NavHost(
		navController = navController,
		startDestination = authRoute,
	) {
		authScreen()
	}
}