package com.finek.android.taskmanager.features.language.data.repositories

import com.finek.android.taskmanager.features.language.data.datasources.mock.ExerciseMockData
import com.finek.android.taskmanager.features.language.data.mappers.ExerciseMapper
import com.finek.android.taskmanager.features.language.domain.interfaces.IExerciseRepository
import com.finek.android.taskmanager.features.language.domain.interfaces.ILessonRepository
import com.finek.android.taskmanager.features.language.domain.models.ExerciseModel
import com.finek.android.taskmanager.features.language.domain.models.LessonModel

class ExerciseRepositoryImpl : IExerciseRepository {

	override fun getExercises(): List<ExerciseModel> {
		return ExerciseMockData.getExercises().map { ExerciseMapper.convert(it) }
	}
}