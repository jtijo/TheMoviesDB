package com.example.presentation.di


import com.example.presentation.utils.CoroutineScoping.useCaseScope
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PresentationModule {

    @Singleton
    @Provides
    @Named("UseCaseScope")
    fun providesCoroutineScope() : CoroutineScope = useCaseScope
}