package com.finek.android.taskmanager.features.language.data.mappers

import com.finek.android.taskmanager.features.language.data.datasources.mock.models.LessonMockModel
import com.finek.android.taskmanager.features.language.domain.models.LessonModel

object LessonMapper {
	fun convert(lesson: LessonMockModel): LessonModel {
		return LessonModel(
			name = lesson.name,
			number = lesson.number,
			docLink = lesson.docLink
		)
	}
}