package com.finek.android.taskmanager.features.language.di

import com.finek.android.taskmanager.features.language.data.repositories.ExerciseRepositoryImpl
import com.finek.android.taskmanager.features.language.domain.interfaces.IExerciseRepository
import org.koin.dsl.module


object RepositoryModule {

    fun getModule() = module {

        single<IExerciseRepository> { ExerciseRepositoryImpl() }
    }
}