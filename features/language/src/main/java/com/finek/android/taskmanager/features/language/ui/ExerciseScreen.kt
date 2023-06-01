package com.finek.android.taskmanager.features.language.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.finek.android.core.ui.components.AppTextButton
import com.finek.android.taskmanager.features.language.domain.models.ExerciseWritingModel
import com.finek.android.taskmanager.features.language.viewmodel.ExerciseViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
internal fun ExerciseScreen(
	viewModel: ExerciseViewModel = koinViewModel()
) {
	LaunchedEffect(key1 = Unit) {
		viewModel.getRandomExercise()
	}
	var isRightAnswerVisible by remember { mutableStateOf(false) }
	val exercise by viewModel.exercise.collectAsState()
	when(exercise) {
		is ExerciseWritingModel -> {
			ExerciseWritingCard(
				exercise = exercise as ExerciseWritingModel,
				isRightAnswerVisible = isRightAnswerVisible,
				onShowAnswerClick = { isRightAnswerVisible = !isRightAnswerVisible },
				onNextCardClick = {
					isRightAnswerVisible = false
					viewModel.getRandomExercise()
				}
			)
		}
		null -> {
			//TODO
		}
	}
}

@Composable
private fun ExerciseWritingCard(
	exercise: ExerciseWritingModel,
	isRightAnswerVisible: Boolean,
	onShowAnswerClick: () -> Unit,
	onNextCardClick: () -> Unit,
) {
	Column(
		modifier = Modifier
			.fillMaxSize()
			.padding(bottom = 25.dp),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally,
	) {
		Card() {
			Text(exercise.task)
		}
		if (isRightAnswerVisible) {
			Card() {
				Text(exercise.rightAnswer)
			}
		}
		AppTextButton(onClick = { onShowAnswerClick() }) {
			Text("Show right answer")
		}
		AppTextButton(onClick = { onNextCardClick() }) {
			Text("Next task")
		}
	}
}

@Preview
@Composable
private fun EmptyPreview() {
	ExerciseWritingCard(
		exercise = ExerciseWritingModel(
			lesson = null,
			grammar = emptyList(),
			task = "this is your task",
			rightAnswer = "this is your right answer"
		),
		isRightAnswerVisible = true,
		onShowAnswerClick = {},
		onNextCardClick = {}
	)
}