package com.finek.android.taskmanager.features.language.di


import com.finek.android.taskmanager.features.language.viewmodel.ExerciseViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object ViewModelKoinModule {

	fun getModule() = module {
		viewModel { ExerciseViewModel(get()) }
	}

}