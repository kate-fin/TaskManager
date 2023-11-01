package com.finek.android.taskmanager.features.language.ui.exercises

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.finek.android.core.ui.components.AppTextButton
import com.finek.android.taskmanager.features.language.R
import com.finek.android.taskmanager.features.language.domain.models.ExerciseDateModel
import com.finek.android.taskmanager.features.language.domain.models.LessonModel
import com.finek.android.taskmanager.features.language.ui.components.LessonCard
import com.finek.android.taskmanager.utils.extensions.format
import java.util.*

@Composable
internal fun ExerciseDateCard(
	exercise: ExerciseDateModel,
	isRightAnswerVisible: Boolean,
	onShowHintClick: () -> Unit,
	onNextCardClick: () -> Unit,
	onLessonClick: (String) -> Unit
) {
	Column(
		modifier = Modifier
			.fillMaxSize()
			.padding(bottom = 25.dp),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally,
	) {
		Card() {
			Text(exercise.task.format())
		}
		if (isRightAnswerVisible) {
			Card() {
				Column(
					horizontalAlignment = Alignment.CenterHorizontally
				) {
					Image(
						modifier = Modifier.padding(5.dp),
						painter = painterResource(id = R.drawable.hint_korean_date),
						contentDescription = null
					)
					Text(exercise.hint)
//					LazyColumn() {
//						itemsIndexed(exercise.lessons) { ind, lesson ->
//							LessonCard(
//								lessonModel = lesson,
//								onLessonClick = onLessonClick
//							)
//						}
//					}
				}
			}
		}
		AppTextButton(onClick = { onShowHintClick() }) {
			Text("Show hints")
		}
		AppTextButton(onClick = { onNextCardClick() }) {
			Text("Next task")
		}
	}
}

@Preview
@Composable
private fun EmptyPreview() {
	ExerciseDateCard(
		exercise = ExerciseDateModel(
			lessons = listOf(
				LessonModel(
					name = "one",
					number = 1,
					docLink = "link"
				),
				LessonModel(
					name = "two",
					number = 2,
					docLink = "link"
				)
			),
			grammars = emptyList(),
			task = Date(1_672_531_200_000),
			hint = "hint"
		),
		isRightAnswerVisible = true,
		onShowHintClick = {},
		onNextCardClick = {},
		onLessonClick = {}
	)
}