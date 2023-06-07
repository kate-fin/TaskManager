package com.finek.android.taskmanager.features.language.domain.models

import com.finek.android.taskmanager.features.language.domain.enums.ExerciseType
import java.util.Date

class ExerciseDateModel(
	override val lessons: List<LessonModel>,
	override val grammars: List<GrammarModel>,
	val task: Date,
	val hint: String,
) : ExerciseModel(possibleExerciseTypes = listOf(ExerciseType.READING, ExerciseType.SPEAKING)) {

}