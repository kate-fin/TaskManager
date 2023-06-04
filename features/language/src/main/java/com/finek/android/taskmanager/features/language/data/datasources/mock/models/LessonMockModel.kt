package com.finek.android.taskmanager.features.language.data.datasources.mock.models

data class LessonMockModel(
	val name: String,
	val number: Int,
	val docLink: String,
	val grammars: List<GrammarMockModel>
)
