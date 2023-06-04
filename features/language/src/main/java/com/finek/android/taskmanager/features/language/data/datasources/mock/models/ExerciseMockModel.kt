package com.finek.android.taskmanager.features.language.data.datasources.mock.models

import com.finek.android.taskmanager.features.language.data.datasources.mock.enums.ExerciseType

data class ExerciseMockModel<T>(
	val name: String = "",
	val lesson: List<LessonMockModel> = emptyList(),
	val grammar: List<GrammarMockModel> = emptyList(),
	val type: ExerciseType,
	val task: T,
	val rightAnswer: String
)
