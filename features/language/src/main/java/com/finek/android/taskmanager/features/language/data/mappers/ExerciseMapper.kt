package com.finek.android.taskmanager.features.language.data.mappers

import com.finek.android.taskmanager.features.language.data.datasources.mock.models.ExerciseMockModel
import com.finek.android.taskmanager.features.language.domain.models.*
import java.util.Date

object ExerciseMapper {
	fun convert(exercise: ExerciseMockModel<*>): ExerciseModel {
		return when(exercise.task) {
			is Date -> {
				ExerciseDateModel(
					lessons = exercise.lesson.map { LessonMapper.convert(it) },
					grammars = exercise.grammar.map { GrammarMapper.convert(it) },
					task = exercise.task,
					hint = exercise.rightAnswer
				)
			}
			else -> {
				ExerciseWritingModel(
					lessons = exercise.lesson.map { LessonMapper.convert(it) },
					grammars = exercise.grammar.map { GrammarMapper.convert(it) },
					task = exercise.task.toString(),
					rightAnswer = exercise.rightAnswer,
				)
			}
		}
	}
}