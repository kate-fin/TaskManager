package com.finek.android.taskmanager.features.language.domain.models

import com.finek.android.taskmanager.features.language.domain.enums.ExerciseType

abstract class ExerciseModel(
	open val lesson: LessonModel? = null,
	open val grammar: List<GrammarModel> = emptyList(),
	val exerciseType: ExerciseType
)
