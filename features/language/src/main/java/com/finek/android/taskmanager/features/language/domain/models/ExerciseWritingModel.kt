package com.finek.android.taskmanager.features.language.domain.models

import com.finek.android.taskmanager.features.language.domain.enums.ExerciseType

class ExerciseWritingModel(
	override val lesson: LessonModel?,
	override val grammar: List<GrammarModel>,
	val task: String,
	val rightAnswer: String,
) : ExerciseModel(exerciseType = ExerciseType.WRITING) {

}