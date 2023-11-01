package com.finek.android.taskmanager.features.language.data.datasources.mock

import com.finek.android.taskmanager.features.language.data.datasources.mock.enums.ExerciseType
import com.finek.android.taskmanager.features.language.data.datasources.mock.models.ExerciseMockModel
import java.util.*

object ExerciseMockData {
	fun getExercises() = datesExercises() //+ phraseExercises()
	private fun phraseExercises() = listOf(
		ExerciseMockModel(
			lesson = listOf(LessonMockData.getLesson(7)),
			grammar = listOf(GrammarMockData.numbersGrammar()),
			type = ExerciseType.PHRASE,
			task = "Сколько у вас бананов? У меня 3 банана.",
			rightAnswer = "바나나가 몇 개 있어요? 바나나가 세 개 있어요.",
		),
		ExerciseMockModel(
			lesson = listOf(LessonMockData.getLesson(7)),
			grammar = listOf(GrammarMockData.numbersGrammar()),
			type = ExerciseType.PHRASE,
			task = "Сколько человек в семье? В семье 5 человек.",
			rightAnswer = "가족이 몇 명입니까? 다섯 명입니다.",
		),
		ExerciseMockModel(
			lesson = listOf(LessonMockData.getLesson(7)),
			grammar = listOf(GrammarMockData.numbersGrammar()),
			type = ExerciseType.PHRASE,
			task = "Сегодня какой урок изучаем? 8 урок изучаем.",
			rightAnswer = "오늘 몇 과를 배웁니까? 팔 과를 배웁니다.",
		),
		ExerciseMockModel(
			lesson = listOf(LessonMockData.getLesson(7)),
			grammar = listOf(GrammarMockData.numbersGrammar()),
			type = ExerciseType.PHRASE,
			task = "Какой номер телефона? 21-04-53.",
			rightAnswer = "전화번호가 몇 번입니까? 이일-영사-오삼 번입니다.",
		),
		ExerciseMockModel(
			lesson = listOf(LessonMockData.getLesson(7)),
			grammar = listOf(GrammarMockData.numbersGrammar()),
			type = ExerciseType.PHRASE,
			task = "На каком этаже комната? Моя комната на 16 этаже.",
			rightAnswer = "반이 몇 층에 있어요? 제 반이 십육 층에 있어요.",
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