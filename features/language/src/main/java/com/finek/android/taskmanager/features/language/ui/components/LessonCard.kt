package com.finek.android.taskmanager.features.language.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.finek.android.taskmanager.features.language.domain.models.LessonModel

@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun LessonCard(lessonModel: LessonModel, onLessonClick: (String) -> Unit) {
	Card(onClick = { onLessonClick(lessonModel.docLink) }) {
		Text(text = lessonModel.name)
	}
}