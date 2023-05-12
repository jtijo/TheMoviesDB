package com.example.domain.usecases

abstract class BaseReturnParameterizedUseCase<in P,R> {
    abstract suspend fun execute(params : P) : R
}