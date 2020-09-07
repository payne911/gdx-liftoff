package com.github.payne.generator


class GeneratorModel {
    val properties = mutableMapOf(
            "org.gradle.daemon" to "false", // was having very bad memory usage with daemon+Android
            "org.gradle.jvmargs" to "-Xms512M -Xmx4G -XX:MaxPermSize=1G -XX:MaxMetaspaceSize=1G",
            "org.gradle.configureondemand" to "false")
}