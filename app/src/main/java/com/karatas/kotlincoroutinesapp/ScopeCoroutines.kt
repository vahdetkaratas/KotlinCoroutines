package com.karatas.kotlincoroutinesapp

import kotlinx.coroutines.*




fun main() {
    runBlocking {

        launch {
            delay(5000)
            println("run blocking")
        }

        coroutineScope {
            launch {
                delay(3000)
                println("coroutine scope")
            }
        }

    }
}