package com.github.payne.generator

import com.github.payne.generator.model.BasicProjectData
import com.github.payne.generator.model.platforms.Platforms


class GeneratorModel(val basicData: BasicProjectData, // todo: replace Gdx.FileHandler
                     val selectedPlatforms: List<Platforms> // todo: enum -> interface
) {
    val properties = mutableMapOf(
            "org.gradle.daemon" to "false", // was having very bad memory usage with daemon+Android
            "org.gradle.jvmargs" to "-Xms512M -Xmx4G -XX:MaxPermSize=1G -XX:MaxMetaspaceSize=1G",
            "org.gradle.configureondemand" to "false")

}