package com.finek.android.taskmanager.features.language.domain.interfaces

import com.finek.android.taskmanager.features.language.domain.models.ExerciseModel

interface IExerciseRepository {

	fun getExercises(): List<ExerciseModel>
}