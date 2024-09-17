package dev.previousw.avnoi.test

import io.github._3xhaust.annotations.Service

@Service
class AppService {
    fun getHello(): Map<String, String> {
        return mapOf("hello" to "Avnoi Application")
    }
}