package com.finek.android.taskmanager.features.language.data.datasources.mock

import com.finek.android.core.data.exceptions.ObjectNotFoundException
import com.finek.android.taskmanager.features.language.data.datasources.mock.models.LessonMockModel

object LessonMockData {

	private const val countOfLessons = 10

	fun getLessons(): List<LessonMockModel> {
		return (0 .. countOfLessons).map {
			LessonMockModel(
				name = "Lesson $it",
				number = it,
				grammars = emptyList()
			)
		}
	}

	fun getLesson(number: Int): LessonMockModel {
		if (number > countOfLessons) throw ObjectNotFoundException("Lesson is not found")
		return LessonMockModel(
			name = "Lesson $number",
			number = number,
			grammars = emptyList()
		)
	}
}