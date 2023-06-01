package com.finek.android.taskmanager.features.language

import android.app.Application
import com.finek.android.taskmanager.features.language.di.RepositoryModule
import com.finek.android.taskmanager.features.language.di.UseCaseModule
import com.finek.android.taskmanager.features.language.di.ViewModelKoinModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class LanguageApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
//        preferences = AppPreferences(this)
        initDependencyInjection()
    }

    private fun initDependencyInjection() {
        startKoin {
            androidContext(this@LanguageApplication)
            modules(
                listOf(
                    UseCaseModule.getModule(),
                    RepositoryModule.getModule(),
                    ViewModelKoinModule.getModule()
                )
            )
        }
    }

    companion object {
        private lateinit var instance: LanguageApplication
//        private lateinit var preferences: AppPreferences

        private const val APPSFLY_DEV_KEY = "syS7PVEF8o7hjyucZzUKkg"

        fun getInstance() = instance

//        fun getPreferences() = preferences
    }
}
