package com.example.domain.usecases

abstract class BaseReturnUseCase<R> {
    abstract suspend fun execute(): R
}