package com.adrian.project.di

import android.content.Context
import com.adrian.project.MyApplication
import com.adrian.project.data.ApiService
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by cadri on 2017. 08. 03..
 */

@Module
class AppModule {

    @Singleton
    @Provides
    @Named("ApplicationContext")
    fun provideContext(myApplication: MyApplication): Context = myApplication.applicationContext

    @Singleton
    @Provides
    fun provideApiService() = ApiService()

}