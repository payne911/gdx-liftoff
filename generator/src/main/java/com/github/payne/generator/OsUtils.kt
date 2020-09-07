package com.github.payne.generator

object OsUtils {
    private val OS = System.getProperty("os.name", "").toLowerCase()

    /**
     * @return `true` if the current OS is Windows
     */
    val isWindows = OS.contains("win")

    /**
     * @return `true` if the current OS is Mac
     */
    val isMac = OS.contains("mac")

    /**
     * @return `true` if the current OS is Unix
     */
    val isUnix = OS.contains("nix") || OS.contains("nux") || OS.contains("aix")

}