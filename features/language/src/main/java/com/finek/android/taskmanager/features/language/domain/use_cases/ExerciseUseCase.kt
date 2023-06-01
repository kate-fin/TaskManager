package com.finek.android.taskmanager.features.language.domain.use_cases

import com.finek.android.taskmanager.features.language.domain.interfaces.IExerciseRepository
import com.finek.android.taskmanager.features.language.domain.models.ExerciseModel
import kotlin.math.min

class ExerciseUseCase(private val repository: IExerciseRepository) {

	fun getRandomExercises(count: Int = 5): List<ExerciseModel> {
		val exercises = repository.getExercises()
		val lastPos = min(exercises.size, count)
		return exercises.shuffled().subList(0, lastPos)
	}
}