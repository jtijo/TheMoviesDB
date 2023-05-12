package com.example.data.di

import android.content.Context
import com.example.data.database.MovieDao
import com.example.data.database.MovieDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun providesMovieDatabase(@ApplicationContext applicationContext: Context): MovieDatabase? {
        return MovieDatabase.getUniversityDatabase(context = applicationContext)
    }

    @Singleton
    @Provides
    fun providesMovieDao(database: MovieDatabase): MovieDao {
        return database.movieDao()
    }
}