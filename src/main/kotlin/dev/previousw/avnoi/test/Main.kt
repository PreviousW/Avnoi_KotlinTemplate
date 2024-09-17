package dev.previousw.avnoi.test

import io.github._3xhaust.Avnoi
import io.github._3xhaust.annotations.AvnoiApplication

@AvnoiApplication
object Main {
    val port = 3029

    @JvmStatic
    fun main(args: Array<String>) {
        Avnoi.listen(port)
        Avnoi.run(AppModule::class.java)
    }
}