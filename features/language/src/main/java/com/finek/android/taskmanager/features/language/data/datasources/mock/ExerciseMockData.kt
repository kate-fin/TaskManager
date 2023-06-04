package com.finek.android.taskmanager.features.language.data.datasources.mock

import com.finek.android.taskmanager.features.language.data.datasources.mock.enums.ExerciseType
import com.finek.android.taskmanager.features.language.data.datasources.mock.models.ExerciseMockModel
import java.text.SimpleDateFormat
import java.util.*

object ExerciseMockData {
	fun getExercises() = datesExercises() + writingTasks()
	private fun writingTasks() = listOf(
		ExerciseMockModel(
			type = ExerciseType.WRITING,
			task = "second task",
			rightAnswer = "second answer"
		),
	)

	private fun datesExercises(): List<ExerciseMockModel<Date>> {
		val countOfDates = 5
		return (0 .. countOfDates).map {
			val calendar = Calendar.getInstance()
			val startMillis = calendar.apply { set(1950, Calendar.JANUARY, 1) }.timeInMillis
			val endMillis = calendar.apply { set(2050, Calendar.JANUARY, 1) }.timeInMillis
			val randomMillis = (startMillis .. endMillis).random()
			val date = Date(randomMillis)
			ExerciseMockModel(
				name = "name date",
				lesson = listOf(
					LessonMockData.getLesson(7),
					LessonMockData.getLesson(8),
					LessonMockData.getLesson(9)
				),
				grammar = listOf(GrammarMockData.dateGrammar()),
				type = ExerciseType.DATE,
				task = date,
				rightAnswer = "오늘은 year[년] month[월] day[일] hour[시] minutes[분] 입니다."
			)
		}
	}
}