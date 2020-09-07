package com.github.payne.generator.model

import com.badlogic.gdx.files.FileHandle // todo: replace those by Strings?

class BasicProjectData(val name: String /* nameField.text */,
                       val rootPackage: String /* rootPackageField.text */,
                       val mainClass: String /* mainClassField.text */,
                       val destination: FileHandle /* Gdx.files.absolute(destinationField.text) */,
                       val androidSdk: FileHandle? /* Gdx.files.absolute(androidSdkPathField.text) */,
                       val androidApiLevel: Int?,
                       val useOldestSdk: Boolean?, val oldestSdk: Int?,
                       val useLatestSdk: Boolean?, val latestSdk: Int?)