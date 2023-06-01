package com.finek.android.taskmanager.features.language.data.datasources.mock

import com.finek.android.taskmanager.features.language.data.datasources.mock.models.ExerciseMockModel

object ExerciseMockData {
	fun getExercises(): List<ExerciseMockModel> {
		return listOf(
			ExerciseMockModel(
				task = "first task",
				rightAnswer = "first answer"
			),
			ExerciseMockModel(
				task = "second task",
				rightAnswer = "second answer"
			),
		)
	}
}