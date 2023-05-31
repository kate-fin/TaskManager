package com.finek.android.taskmanager.features.language.domain.interfaces

interface ILessonRepository {

	fun getLessons(): List<LessonModel>
}