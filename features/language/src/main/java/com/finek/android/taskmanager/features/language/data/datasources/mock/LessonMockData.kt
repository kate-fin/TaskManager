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
				grammars = emptyList(),
				docLink = ""
			)
		}
	}

	fun getLesson(number: Int): LessonMockModel {
		if (number > countOfLessons) throw ObjectNotFoundException("Lesson is not found")
		return when(number) {
			7 -> {
				LessonMockModel(
					name = "Lesson $number",
					number = number,
					grammars = emptyList(),
					docLink = "https://disk.yandex.ru/i/8xkD-yy2ATvM9A"
				)
			}
			8 -> {
				LessonMockModel(
					name = "Lesson $number",
					number = number,
					grammars = emptyList(),
					docLink = "https://disk.yandex.ru/i/xL8sl8eB7NKGaw"
				)
			}
			9 -> {
				LessonMockModel(
					name = "Lesson $number",
					number = number,
					grammars = emptyList(),
					docLink = "https://disk.yandex.ru/i/8WAc8SRXWznZHQ"
				)
			}
			else -> {
				LessonMockModel(
					name = "Lesson $number",
					number = number,
					grammars = emptyList(),
					docLink = ""
				)
			}
		}
	}
}