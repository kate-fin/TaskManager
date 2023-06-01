package com.finek.android.taskmanager.features.language.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.finek.android.taskmanager.features.language.domain.models.ExerciseModel
import com.finek.android.taskmanager.features.language.domain.use_cases.ExerciseUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class ExerciseViewModel(private val exerciseUseCase: ExerciseUseCase) : ViewModel(), KoinComponent {

	private var _exercise = MutableStateFlow<ExerciseModel?>(null)
	val exercise = _exercise.asStateFlow()

	private var _exerciseList = MutableStateFlow<List<ExerciseModel>>(emptyList())//: List<ExerciseModel> by mutableStateOf(listOf())
	private val exerciseList = _exerciseList.asStateFlow()
	private var currentPosition by mutableStateOf(0)

	private fun getExercises() {
		_exerciseList.value = exerciseUseCase.getRandomExercises()
	}

	fun getRandomExercise() = viewModelScope.launch {
		if (exerciseList.value.isEmpty()) {
			getExercises()
		}
		_exercise.value = exerciseList.value.getOrNull(currentPosition)
		currentPosition += 1
		currentPosition %= exerciseList.value.size
	}
}