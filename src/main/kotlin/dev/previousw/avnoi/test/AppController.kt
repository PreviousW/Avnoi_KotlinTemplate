package dev.previousw.avnoi.test

import dev.previousw.avnoi.test.Main.port
import dev.previousw.avnoi.test.example.ExampleDTO
import io.github._3xhaust.annotations.Controller
import io.github._3xhaust.annotations.Inject
import io.github._3xhaust.annotations.Query
import io.github._3xhaust.annotations.Redirect
import io.github._3xhaust.annotations.types.Get

@Controller("/")
class AppController @Inject constructor(private val appService: AppService) {

    @Get("landing")
    fun getHello(): Map<String, String> {
        return appService.getHello()
    }

    @Get
    @Redirect(statusCode = 302)
    fun home(): Map<String, String> {
        return mapOf("url" to "http://localhost:$port/landing")
    }
}