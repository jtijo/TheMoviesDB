package com.example.data.di

import com.example.data.api.ApiService
import com.example.data.boundary.DataMapper
import com.example.data.repository.MovieRepository
import com.example.domain.repositorycontracts.DomainMovieRepositoryContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
    @Singleton
    @Provides
    fun providesMovieRepository(
        apiService: ApiService,
        mapper: DataMapper
    ): MovieRepository = MovieRepository(
        apiService = apiService,
        mapper = mapper
    )

    @Singleton
    @Provides
    fun providesDomainMovieRepositoryContract(
        movieRepository: MovieRepository
    ): DomainMovieRepositoryContract = movieRepository as DomainMovieRepositoryContract
}