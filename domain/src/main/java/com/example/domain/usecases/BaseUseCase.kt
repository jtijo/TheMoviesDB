package com.example.domain.usecases

abstract class BaseUseCase {
    abstract suspend fun execute()
}