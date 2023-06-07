package com.finek.android.taskmanager.features.language.domain.models

import com.finek.android.taskmanager.features.language.domain.enums.ExerciseType

class ExercisePhraseModel(
	override val lessons: List<LessonModel>,
	override val grammars: List<GrammarModel>,
	val task: String,
	val rightAnswer: String?,
) : ExerciseModel(
	possibleExerciseTypes = listOf(
		ExerciseType.READING,
		ExerciseType.SPEAKING,
		ExerciseType.LISTENING,
		ExerciseType.WRITING
	)
) {

}