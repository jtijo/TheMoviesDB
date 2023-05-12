package com.example.presentation.utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

object CoroutineScoping {
    val useCaseScope = CoroutineScope(Dispatchers.IO)
}