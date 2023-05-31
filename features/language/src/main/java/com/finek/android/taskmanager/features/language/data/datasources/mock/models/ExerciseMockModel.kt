package com.finek.android.taskmanager.features.language.data.datasources.mock.models

data class ExerciseMockModel(
	val name: String = "",
	val lesson: LessonMockModel? = null,
	val grammar: List<GrammarMockModel> = emptyList(),
	val task: String,
	val rightAnswer: String
)
