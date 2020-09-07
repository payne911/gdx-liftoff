package com.github.payne.generator.model.platforms

enum class Platforms(val nameDTO: String) {
    ANDROID("Android"),
    CORE("Core"),
    DESKTOP_LEGACY("desktop-legacy"),
    HEADLESS("headless"),
    HTML("html"), // todo: "GWT" ?
    IOS("ios"),
    IOS_MOE("ios-moe"),
    JGLFW("jglfw"),
    LWJGL3("lwjgl3"),
    SERVER("server"),
    SHARED("shared")
}