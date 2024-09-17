package dev.previousw.avnoi.test

import io.github._3xhaust.annotations.Module

@Module(
    imports = [],
    controllers = [AppController::class],
    providers = [AppService::class]
)

class AppModule {}