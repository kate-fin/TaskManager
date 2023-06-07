package com.finek.android.taskmanager.features.language.domain.models

import com.finek.android.taskmanager.features.language.domain.enums.ExerciseType

abstract class ExerciseModel(
	open val lessons: List<LessonModel> = emptyList(),
	open val grammars: List<GrammarModel> = emptyList(),
	private val possibleExerciseTypes: List<ExerciseType>,
	val exerciseType: ExerciseType = possibleExerciseTypes.random()
)
