package com.finek.android.taskmanager

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.finek.android.taskmanager.features.auth.authGraph
import com.finek.android.taskmanager.features.auth.authGraphRoute

@Composable
fun AppNavigation(
	navController: NavHostController,
) {
	NavHost(
		navController = navController,
		startDestination = authGraphRoute,
	) {
		authGraph(navController)
	}
}