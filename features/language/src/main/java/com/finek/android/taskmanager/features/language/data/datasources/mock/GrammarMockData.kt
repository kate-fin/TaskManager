package com.finek.android.taskmanager.features.language.data.datasources.mock

import com.finek.android.taskmanager.features.language.data.datasources.mock.models.GrammarMockModel

object GrammarMockData {
	fun getGrammars(): List<GrammarMockModel> {
		return emptyList()
	}

	fun dateGrammar() = GrammarMockModel(
		name = "date grammar",
		rule = ""
	)
}