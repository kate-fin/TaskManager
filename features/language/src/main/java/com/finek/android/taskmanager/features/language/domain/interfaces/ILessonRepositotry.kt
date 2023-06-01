package com.finek.android.taskmanager.features.language.domain.interfaces

import com.finek.android.taskmanager.features.language.domain.models.LessonModel

interface ILessonRepository {

	fun getLessons(): List<LessonModel>
}