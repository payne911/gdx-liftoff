package com.github.czyzby.setup.data.gradle

import com.github.czyzby.setup.data.platforms.Android
import com.github.czyzby.setup.data.project.Project

/**
 * Gradle file of the root project. Manages build script and global settings.
 * @author MJ
 */
class RootGradleFile(val hasAndroidPlatform: Boolean,
                     val javaVersion: String,
                     val projectName: String,
                     val advancedProjectVersion: String // todo: change that name
) : GradleFile("") {
    val plugins = mutableSetOf<String>() // selected languages
    val buildRepositories = mutableSetOf<String>()

    init {
        buildRepositories.add("mavenLocal()")
        buildRepositories.add("mavenCentral()")
        buildRepositories.add("google()")
        buildRepositories.add("maven { url 'https://oss.sonatype.org/content/repositories/snapshots/' }")
        buildRepositories.add("jcenter()")
    }

    override fun getContent(): String = """buildscript {
	repositories {
${buildRepositories.joinToString(separator = "\n") { "		$it" }}
	}
	dependencies {
${joinDependencies(buildDependencies, type = "classpath", tab = "		")}	}
}

allprojects {
	apply plugin: 'eclipse'
	apply plugin: 'idea'
}

configure(subprojects${if (hasAndroidPlatform) {
        " - project(':android')"
    } else {
        ""
    }}) {
${plugins.joinToString(separator = "\n") { "	apply plugin: '$it'" }}
	sourceCompatibility = $javaVersion
	compileJava {
		options.incremental = true
	}
}

subprojects {
	version = '${advancedProjectVersion}'
	ext.appName = '${projectName}'
	repositories {
		mavenLocal()
		mavenCentral()
		maven { url 'https://oss.sonatype.org/content/repositories/snapshots/' }
		maven { url 'https://jitpack.io' }
		jcenter()
	}
}

// Clearing Eclipse project data in root folder:
tasks.eclipse.doLast {
	delete '.project'
	delete '.classpath'
	delete '.settings/'
}
"""

}
