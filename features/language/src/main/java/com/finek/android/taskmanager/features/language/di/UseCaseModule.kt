package com.finek.android.taskmanager.features.language.di

import com.finek.android.taskmanager.features.language.domain.use_cases.ExerciseUseCase
import org.koin.dsl.module


object UseCaseModule {

    fun getModule() = module {

        single<ExerciseUseCase> { ExerciseUseCase(get()) }
    }
}