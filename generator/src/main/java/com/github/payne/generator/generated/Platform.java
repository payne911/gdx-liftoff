package com.github.payne.generator.generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum Platform {

    ANDROID("android"),
    CORE("core"),
    DESKTOP_LEGACY("desktop-legacy"),
    HEADLESS("headless"),
    HTML("html"),
    IOS("ios"),
    LWJGL_3("lwjgl3"),
    SERVER("server"),
    SHARED("shared");
    private final String value;
    private final static Map<String, Platform> CONSTANTS = new HashMap<String, Platform>();

    static {
        for (Platform c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private Platform(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Platform fromValue(String value) {
        Platform constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}