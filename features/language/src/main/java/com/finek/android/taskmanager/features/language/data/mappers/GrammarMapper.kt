package com.finek.android.taskmanager.features.language.data.mappers

import com.finek.android.taskmanager.features.language.data.datasources.mock.models.GrammarMockModel
import com.finek.android.taskmanager.features.language.domain.models.GrammarModel
import com.finek.android.taskmanager.features.language.domain.models.LessonModel

object GrammarMapper {
	fun convert(grammar: GrammarMockModel): GrammarModel {
		return GrammarModel(
			name = grammar.name,
			rule = grammar.rule
		)
	}
}