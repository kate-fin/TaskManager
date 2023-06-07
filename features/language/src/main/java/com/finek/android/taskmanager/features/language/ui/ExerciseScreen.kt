package com.finek.android.taskmanager.features.language.ui

import androidx.compose.runtime.*
import com.finek.android.taskmanager.features.language.domain.models.ExerciseDateModel
import com.finek.android.taskmanager.features.language.domain.models.ExercisePhraseModel
import com.finek.android.taskmanager.features.language.ui.exercises.ExerciseDateCard
import com.finek.android.taskmanager.features.language.ui.exercises.ExerciseWritingCard
import com.finek.android.taskmanager.features.language.viewmodel.ExerciseViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
internal fun ExerciseScreen(
	viewModel: ExerciseViewModel = koinViewModel(),
	onLessonClick: (String) -> Unit
) {
	LaunchedEffect(key1 = viewModel.exercise) {
		if (viewModel.exercise.value == null) viewModel.getRandomExercise()
	}
	val exercise by viewModel.exercise.collectAsState()
	when(exercise) {
		is ExercisePhraseModel -> {
			ExerciseWritingCard(
				exercise = exercise as ExercisePhraseModel,
				isRightAnswerVisible = viewModel.isRightAnswerVisible,
				onShowAnswerClick = { viewModel.changeRightAnswerVisibility() },
				onNextCardClick = {
					viewModel.changeRightAnswerVisibility(false)
					viewModel.getRandomExercise()
				}
			)
		}
		is ExerciseDateModel -> {
			ExerciseDateCard(
				exercise = exercise as ExerciseDateModel,
				isRightAnswerVisible = viewModel.isRightAnswerVisible,
				onShowHintClick = { viewModel.changeRightAnswerVisibility() },
				onNextCardClick = {
					viewModel.changeRightAnswerVisibility(false)
					viewModel.getRandomExercise()
				},
				onLessonClick = onLessonClick
			)
		}
		null -> {
			//TODO
		}
	}
}