package com.github.czyzby.setup.views

import com.badlogic.gdx.files.FileHandle

/**
 * Filled by the LML parser, this class contains references to basic project data widgets.
 * @author MJ
 */
class BasicProjectData(val name: String /* nameField.text */,
                       val rootPackage: String /* rootPackageField.text */,
                       val mainClass: String /* mainClassField.text */,
                       val destination: FileHandle /* Gdx.files.absolute(destinationField.text) */,
                       val androidSdk: FileHandle? /* Gdx.files.absolute(androidSdkPathField.text) */,
                       val androidApiLevel: Int?,
                       val useOldestSdk: Boolean?, val oldestSdk: Int?,
                       val useLatestSdk: Boolean?, val latestSdk: Int?)
