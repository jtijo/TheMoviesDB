package com.example.domain.usecases

abstract class BaseNoReturnParameterizedUseCase<P> {
    abstract suspend fun execute(params: P)
}