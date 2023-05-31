package com.finek.android.taskmanager.features.language.data.mappers

import com.finek.android.taskmanager.features.language.data.datasources.mock.models.ExerciseMockModel
import com.finek.android.taskmanager.features.language.data.datasources.mock.models.GrammarMockModel
import com.finek.android.taskmanager.features.language.domain.models.ExerciseWritingModel
import com.finek.android.taskmanager.features.language.domain.models.GrammarModel
import com.finek.android.taskmanager.features.language.domain.models.LessonModel

object ExerciseMapper {
	fun convert(exercise: ExerciseMockModel): ExerciseWritingModel {
		return ExerciseWritingModel(
			lesson = exercise.lesson?.let { LessonMapper.convert(it) },
			grammar = exercise.grammar.map { GrammarMapper.convert(it) },
			task = exercise.task,
			rightAnswer = exercise.rightAnswer,
		)
	}
}