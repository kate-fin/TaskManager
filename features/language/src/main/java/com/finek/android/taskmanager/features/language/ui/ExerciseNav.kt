package com.finek.android.taskmanager.features.language.ui

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.finek.android.core.ui.navigateToInfo
import org.koin.androidx.compose.koinViewModel


const val languageGraphRoute = "language"
fun NavGraphBuilder.languageGraph(navController: NavController) {
	navigation(startDestination = exerciseRoute, route = languageGraphRoute) {
		exerciseScreen(navController)
	}
}

private const val exerciseRoute = "exercise"

fun NavController.navigateToExercise(navOptions: NavOptions? = null) {
	this.navigate(exerciseRoute, navOptions)
}

fun NavGraphBuilder.exerciseScreen(navController: NavController) {
	composable(route = exerciseRoute) {
		ExerciseScreen(onLessonClick = { url -> navController.navigateToInfo(url) })
	}
}